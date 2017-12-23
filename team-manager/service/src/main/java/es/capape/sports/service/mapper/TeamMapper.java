package es.capape.sports.service.mapper;

import java.util.List;

import es.capape.sports.domain.Team;
import es.capape.sports.model.dto.TeamDTO;

public interface TeamMapper {

    Team createTeamFromTeamVO(TeamDTO teamVO);

    TeamDTO createTeamVOFromTeam(Team team);

    List<TeamDTO> createTeamVOsFromTeams(List<Team> teams);

}
