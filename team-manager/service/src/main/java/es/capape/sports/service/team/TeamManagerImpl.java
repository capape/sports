package es.capape.sports.service.team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.capape.sports.domain.Team;

@Service
public class TeamManagerImpl implements TeamManager {

    @Override
    public List<Team> getAllTeams() {
        // TODO Auto-generated method stub

        List<Team> teams = new ArrayList<>();
        Team team1 = new Team();
        team1.setId(1l);
        team1.setName("Team1");

        Team team2 = new Team();
        team2.setId(2l);

        teams.add(team1);
        teams.add(team2);
        return teams;
    }

    @Override
    public Team addTeam() {
        // TODO Auto-generated method stub
        Team team = new Team();
        team.setId(3l);
        team.setName("Team3");
        return team;
    }

    @Override
    public List<Team> getTeams(Integer page, Integer teamsPerPage) {
        // TODO Auto-generated method stub
        return getAllTeams();
    }

}
