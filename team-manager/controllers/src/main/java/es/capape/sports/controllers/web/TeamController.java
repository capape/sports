package es.capape.sports.controllers.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import es.capape.sports.domain.Team;
import es.capape.sports.service.team.TeamManager;

@Controller
@RequestMapping(value = "/team")
public class TeamController {

    @Autowired
    private TeamManager teamManager;

    @RequestMapping(produces = { "application/json" })
    @ResponseBody
    public List<Team> pageJson(
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "rpp", required = false) Integer recordsPerPage)
            throws Exception {

        Integer pageInt = getParamePage(page);
        Integer rpp = getParamRecordsPage(page, recordsPerPage);

        List<Team> teams;
        teams = getTeamManager().getTeams(pageInt, rpp);

        return teams;

    }

    @RequestMapping()
    public ModelAndView page(
            @RequestParam(value = "page", required = false) Integer page,
            @RequestParam(value = "rpp", required = false) Integer recordsPerPage)
            throws Exception {

        Integer pageInt = getParamePage(page);
        Integer rpp = getParamRecordsPage(page, recordsPerPage);

        List<Team> teams;
        teams = getTeamManager().getTeams(pageInt, rpp);

        Map<String, Object> model = new HashMap<>();
        model.put("teams", teams);
        model.put("page", pageInt);
        model.put("rpp", rpp);

        return new ModelAndView("team", "model", model);

    }

    private Integer getParamRecordsPage(Integer page, Integer recordsPerPage) {
        Integer rpp;
        if (page == null) {
            rpp = getDefaulRecordsPerPage();
        } else {
            rpp = recordsPerPage;
        }
        return rpp;
    }

    private Integer getParamePage(Integer page) {
        Integer pageInt;
        if (page == null) {
            pageInt = 1;
        } else {
            pageInt = page;
        }
        return pageInt;
    }

    private Integer getDefaulRecordsPerPage() {
        return Integer.valueOf(100);
    }

    public TeamManager getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(TeamManager teamManager) {
        this.teamManager = teamManager;
    }
}
