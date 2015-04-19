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
    public void testPage() throws Exception {

        ModelAndView modelAndView = controller.page(null, null);
        assertEquals("team", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());

    }

    // @Test
    // public void testPageJson() throws Exception {
    //
    // ModelAndView modelAndView = controller.pageJson(null, null);
    // assertEquals("team", modelAndView.getViewName());
    // assertNotNull(modelAndView.getModel());
    //
    // }

}
