package es.capape.sports.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import es.capape.sports.domain.AgeCategory;
import es.capape.sports.domain.Team;

@ContextConfiguration(locations = { "/es/capape/sports/persistence/test-persistence-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class PersistenceUnitTest {

    @Autowired
    private SessionFactory sessionFactory;
    private Session currentSession;

    @Before
    public void openSession() {
        currentSession = sessionFactory.getCurrentSession();
    }

    @Test
    @Transactional
    public void shouldHaveASessionFactory() {
        assertNotNull(sessionFactory);
    }

    @Test
    @Transactional
    public void shouldHaveNoObjectsAtStart() {
        List<?> results = currentSession.createQuery("from Team").list();
        assertTrue(results.isEmpty());
    }

    @Test
    @Transactional
    public void shouldBeAbleToPersistAnObject() {
        assertEquals(0, currentSession.createQuery("from Team").list().size());
        Team team = new Team();
        team.setName("Maristas");

        AgeCategory category = new AgeCategory();
        category.setName("JUNIOR");
        currentSession.persist(category);

        team.setCategory(category);
        currentSession.persist(team);
        currentSession.flush();
        assertEquals(1, currentSession.createQuery("from Team").list().size());
    }

    @Test
    @Transactional
    public void shouldBeAbleToQueryForObjects() {
        shouldBeAbleToPersistAnObject();

        assertEquals(1,
                currentSession.createQuery("from Team where name = 'Maristas'")
                        .list().size());
        assertEquals(0,
                currentSession.createQuery("from Team where name = 'Maristaz'")
                        .list().size());
    }

}
