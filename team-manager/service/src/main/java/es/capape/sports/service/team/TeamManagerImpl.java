package es.capape.sports.service.team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.capape.sports.model.Team;

@Service
public class TeamManagerImpl implements TeamManager {

    @Override
    public List<Team> getAllTeams() {
        // TODO Auto-generated method stub

        List<Team> teams = new ArrayList<>();
        teams.add(new Team(1));
        return teams;
    }

    @Override
    public Team addTeam() {
        // TODO Auto-generated method stub
        return new Team(2);
    }

}
