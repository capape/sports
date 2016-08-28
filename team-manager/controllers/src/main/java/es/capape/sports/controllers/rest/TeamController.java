package es.capape.sports.controllers.rest;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.capape.sports.model.vo.TeamVO;
import es.capape.sports.service.team.TeamManager;
import es.capape.sports.service.team.TeamRepositoryService;

@Controller
@RequestMapping(value = "/team")
public class TeamController {

    @Autowired
    private TeamManager teamManager;

    @Resource(name = "teamRepositoryService")
    private TeamRepositoryService teamRespositoryService;

    @RequestMapping(value = "all", produces = { "application/json" })
    @ResponseBody
    public List<TeamVO> getAll() {

        final List<TeamVO> result = this.teamRespositoryService.getAll();
        return result;
    }

    @RequestMapping(value = "add", produces = { "application/json" })
    @ResponseBody
    public TeamVO addTeam(@RequestBody TeamVO team) {

        if (team == null) {
            throw new RuntimeException("Invalid team");
        }

        final TeamVO result = this.teamRespositoryService.createTeam(team);
        return result;
    }

    @RequestMapping(value = "search/{name}/{page}/{pagesize}", produces = { "application/json" })
    @ResponseBody
    public List<TeamVO> getTeam(@PathVariable("name") String name, @PathVariable("page") int page,
            @PathVariable("pagesize") int pageSize) {
        final String toSearch;
        if (name == null) {
            toSearch = "";
        } else {
            toSearch = name;
        }
        final List<TeamVO> result = this.teamRespositoryService.getByName(toSearch, page, pageSize);
        return result;
    }

    @RequestMapping(value = "get/{teamid}", produces = { "application/json" })
    @ResponseBody
    public TeamVO getTeam(@PathVariable("teamid") Long teamId) {
        if (teamId == null) {
            throw new RuntimeException("Invalid team id");
        }
        final TeamVO result = this.teamRespositoryService.getTeam(teamId);
        return result;
    }

    @RequestMapping(value = "update", produces = { "application/json" })
    @ResponseBody
    public String updateTeam(@RequestBody TeamVO team) {
        return "{ 'team' : 1}";
    }

    @RequestMapping(value = "get/club/{clubid}", produces = { "application/json" })
    @ResponseBody
    public String getTeamsByClub(@PathVariable("clubid") long clubId) {
        return "[{ 'team' : 1}]";
    }

    @RequestMapping(value = "get/club/{leagueid}", produces = { "application/json" })
    @ResponseBody
    public String getTeamsByLeague(@PathVariable("leagueid") long leagueId) {
        return "[{ 'team' : 1}]";
    }

    public TeamManager getTeamManager() {
        return this.teamManager;
    }

    public void setTeamManager(TeamManager teamManager) {
        this.teamManager = teamManager;
    }

    public TeamRepositoryService getTeamRespositoryService() {
        return this.teamRespositoryService;
    }

    public void setTeamRespositoryService(TeamRepositoryService teamRespositoryService) {
        this.teamRespositoryService = teamRespositoryService;
    }
}
