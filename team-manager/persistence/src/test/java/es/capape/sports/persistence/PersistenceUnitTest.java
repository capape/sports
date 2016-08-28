package es.capape.sports.persistence;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.List;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import es.capape.sports.domain.AgeCategory;
import es.capape.sports.domain.Team;

@ContextConfiguration(locations = { "/es/capape/sports/persistence/test-persistence-context.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class PersistenceUnitTest {

    @Resource(name = "testEntityManagerFactory")
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    @Before
    public void openSession() {
        this.entityManager = this.entityManagerFactory.createEntityManager();
        this.entityManager.getTransaction().begin();
    }

    @After
    public void closeSession() {
        this.entityManager.getTransaction().rollback();
    }

    @Test
    public void shouldHaveAEntityManagerFactory() {
        assertNotNull(this.entityManagerFactory);
    }

    @Test
    public void shouldHaveNoObjectsAtStart() {
        final List<?> results = this.entityManager.createQuery("from Team").getResultList();
        assertTrue(results.isEmpty());
    }

    @Test
    public void shouldBeAbleToPersistAnObject() {
        assertEquals(0, this.entityManager.createQuery("from Team").getResultList().size());
        final Team team = new Team();
        team.setName("Maristas");

        final AgeCategory category = new AgeCategory();
        category.setName("JUNIOR");
        this.entityManager.persist(category);

        team.setCategory(category);
        this.entityManager.persist(team);
        this.entityManager.flush();
        assertEquals(1, this.entityManager.createQuery("from Team").getResultList().size());
    }

    @Test
    public void shouldBeAbleToQueryForObjects() {
        shouldBeAbleToPersistAnObject();

        assertEquals(1,
                this.entityManager.createQuery("from Team where name = 'Maristas'").getResultList().size());
        assertEquals(0,
                this.entityManager.createQuery("from Team where name = 'Maristaz'").getResultList().size());
    }

}
