package es.capape.sports.service.team;

import java.util.List;

import es.capape.sports.model.vo.TeamVO;

public interface TeamRepositoryService {

    TeamVO createTeam(TeamVO team);

    List<TeamVO> getAll();

    TeamVO getTeam(Long teamId);

    List<TeamVO> getByName(String name, int page, int pageSize);

}
