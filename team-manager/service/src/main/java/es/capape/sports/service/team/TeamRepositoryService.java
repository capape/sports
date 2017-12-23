package es.capape.sports.service.team;

import java.util.List;

import es.capape.sports.model.dto.TeamDTO;

public interface TeamRepositoryService {

    TeamDTO createTeam(TeamDTO team);

    List<TeamDTO> getAll();

    TeamDTO getTeam(Long teamId);

    List<TeamDTO> getByName(String name, int page, int pageSize);

}
