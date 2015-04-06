package es.capape.sports.service.team;

import java.util.List;

import es.capape.sports.model.Team;

public interface TeamManager {

    List<Team> getAllTeams();

    Team addTeam();
}
