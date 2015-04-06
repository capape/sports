package es.capape.sports.controllers.web;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import es.capape.sports.service.team.TeamManager;

@ContextConfiguration(locations = { "/es/capape/sports/controllers/web/test-controller-web-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TeamControllerTest {

    @Autowired
    private TeamController controller;

    @Mock
    private TeamManager teamManager;

    @Test
    public void testHandleRequest() throws Exception {

        ModelAndView modelAndView = controller.handleRequest(null, null);
        assertEquals("team", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());

    }

}
