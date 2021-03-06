package es.capape.sports.service.team;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;
import es.capape.sports.domain.Team;
import es.capape.sports.model.dto.TeamDTO;
import es.capape.sports.repositories.TeamRepository;
import es.capape.sports.service.mapper.TeamMapper;

@Component("teamRepositoryService")
public class TeamRepositoryServiceImpl implements TeamRepositoryService {

    private static final char WILDCHAR = '%';

    @Autowired
    private TeamRepository teamRepository;

    @Resource(name = "teamMapper")
    private TeamMapper teamMapper;

    @Override
    public TeamDTO createTeam(TeamDTO teamVO) {

        if (teamVO.id != null) {
            throw new RuntimeException("Creating team but id already assigned");
        }

        final Team team = this.teamMapper.createTeamFromTeamVO(teamVO);

        final Team teamCreated = this.teamRepository.save(team);

        final TeamDTO teamCreatedVO = this.teamMapper.createTeamVOFromTeam(teamCreated);

        return teamCreatedVO;
    }

    @Override
    public List<TeamDTO> getAll() {
      //  final Sort sort = new Sort(Direction.ASC, "name");
        final List<Team> teams = this.teamRepository.findAll();
        final List<TeamDTO> result = this.teamMapper.createTeamVOsFromTeams(teams);
        return result;
    }

    @Override
    public TeamDTO getTeam(Long teamId) {

        final Team team = this.teamRepository.findOne(teamId);

        final TeamDTO teamVO = this.teamMapper.createTeamVOFromTeam(team);

        return teamVO;

    }

    @Override
    public List<TeamDTO> getByName(String name, int pageIndex, int pageSize) {

        final Pageable page = new PageRequest(pageIndex, pageSize, Sort.Direction.ASC, "name");

        final StringBuffer searchPattern = new StringBuffer(name);
        searchPattern.append(WILDCHAR);
        searchPattern.insert(0, WILDCHAR);

        final List<Team> teams = this.teamRepository.getTeamsByName(searchPattern.toString(), page);
        final List<TeamDTO> result = this.teamMapper.createTeamVOsFromTeams(teams);
        return result;
    }

}
