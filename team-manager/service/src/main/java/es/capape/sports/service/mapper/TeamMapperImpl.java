package es.capape.sports.service.mapper;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import es.capape.sports.domain.AgeCategory;
import es.capape.sports.domain.League;
import es.capape.sports.domain.Team;
import es.capape.sports.model.dto.AgeCategoryDTO;
import es.capape.sports.model.dto.LeagueDTO;
import es.capape.sports.model.dto.TeamDTO;

@Component("teamMapper")
public class TeamMapperImpl implements TeamMapper {

    @Resource(name = "categoryMapper")
    private CategoryMapper categoryMapper;

    @Resource(name = "leagueMapper")
    private LeagueMapper leagueMapper;

    @Override
    public Team createTeamFromTeamVO(TeamDTO teamVO) {
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
    public TeamDTO createTeamVOFromTeam(Team team) {
        final TeamDTO teamVO = new TeamDTO();
        teamVO.id = team.getId();
        teamVO.name = team.getName();

        final AgeCategoryDTO categoryVO = this.categoryMapper.createCategoryVOFromCategory(team.getCategory());
        teamVO.category = categoryVO;

        final List<LeagueDTO> leagues = this.leagueMapper.createLeaguesVOFromLeagues(team.getLeagues());
        teamVO.leagues = leagues;

        return teamVO;
    }

    @Override
    public List<TeamDTO> createTeamVOsFromTeams(List<Team> teams) {
        final List<TeamDTO> result = new ArrayList<>();

        for (final Team team : teams) {
            result.add(createTeamVOFromTeam(team));
        }
        return result;
    }

}
