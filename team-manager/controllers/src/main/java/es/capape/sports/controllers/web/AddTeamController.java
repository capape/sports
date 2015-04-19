package es.capape.sports.controllers.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.capape.sports.service.team.TeamManager;

@Controller
@RequestMapping(value = "/addteam")
public class AddTeamController {

    @Autowired
    private TeamManager teamManager;

    @RequestMapping()
    public ModelAndView page() throws Exception {

        Map<String, Object> model = new HashMap<>();

        return new ModelAndView("addteam", "model", model);

    }

    public TeamManager getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(TeamManager teamManager) {
        this.teamManager = teamManager;
    }
}
