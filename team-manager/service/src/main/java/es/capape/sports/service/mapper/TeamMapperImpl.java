package es.capape.sports.service.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import es.capape.sports.domain.AgeCategory;
import es.capape.sports.domain.League;
import es.capape.sports.domain.Team;
import es.capape.sports.model.vo.AgeCategoryVO;
import es.capape.sports.model.vo.LeagueVO;
import es.capape.sports.model.vo.TeamVO;

@Component("teamMapper")
public class TeamMapperImpl implements TeamMapper {

    @Resource(name = "categoryMapper")
    private CategoryMapper categoryMapper;

    @Resource(name = "leagueMapper")
    private LeagueMapper leagueMapper;

    @Override
    public Team createTeamFromTeamVO(TeamVO teamVO) {
        final Team team = new Team();
        team.setId(teamVO.id);
        team.setName(teamVO.name);

        final AgeCategory category = this.categoryMapper.createCategoryFromCategoryVO(teamVO.category);
        team.setCategory(category);

        final List<League> leagues = this.leagueMapper.createLeaguesFromLeaguesVO(teamVO.leagues);
        team.setLeagues(leagues);

        return team;
    }

    @Override
    public TeamVO createTeamVOFromTeam(Team team) {
        final TeamVO teamVO = new TeamVO();
        teamVO.id = team.getId();
        teamVO.name = team.getName();

        final AgeCategoryVO categoryVO = this.categoryMapper.createCategoryVOFromCategory(team.getCategory());
        teamVO.category = categoryVO;

        final List<LeagueVO> leagues = this.leagueMapper.createLeaguesVOFromLeagues(team.getLeagues());
        teamVO.leagues = leagues;

        return teamVO;
    }

    @Override
    public List<TeamVO> createTeamVOsFromTeams(List<Team> teams) {
        final List<TeamVO> result = new ArrayList<>();

        for (final Team team : teams) {
            result.add(createTeamVOFromTeam(team));
        }
        return result;
    }

}
