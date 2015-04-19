package es.capape.sports.service.team;

import java.util.List;

import es.capape.sports.domain.Team;

public interface TeamManager {

    List<Team> getTeams(Integer page, Integer teamsPerPage);

    List<Team> getAllTeams();

    Team addTeam();
}
