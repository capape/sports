package es.capape.sports.controllers.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.capape.sports.model.Team;
import es.capape.sports.service.team.TeamManager;

@Controller
public class TeamController {

    @Autowired
    private TeamManager teamManager;

    @RequestMapping(value = "/team.htm")
    public ModelAndView handleRequest(HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        List<Team> teams;
        teams = getTeamManager().getAllTeams();

        Map<String, Object> model = new HashMap<>();
        model.put("teams", teams);

        return new ModelAndView("team", "teamModel", model);

    }

    public TeamManager getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(TeamManager teamManager) {
        this.teamManager = teamManager;
    }
}
