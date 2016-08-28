package es.capape.sports.service.mapper;

import java.util.List;

import es.capape.sports.domain.Team;
import es.capape.sports.model.vo.TeamVO;

public interface TeamMapper {

    Team createTeamFromTeamVO(TeamVO teamVO);

    TeamVO createTeamVOFromTeam(Team team);

    List<TeamVO> createTeamVOsFromTeams(List<Team> teams);

}
