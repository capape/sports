package es.capape.sports.domain;

import static javax.persistence.GenerationType.AUTO;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class League implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -4797315954662913586L;

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    private List<Team> competitors;

    @ManyToOne
    private LeagueCategory category;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Team> getCompetitors() {
        return this.competitors;
    }

    public void setCompetitors(final List<Team> competitors) {
        this.competitors = competitors;
    }

    public LeagueCategory getCategory() {
        return this.category;
    }

    public void setCategory(final LeagueCategory category) {
        this.category = category;
    }
}
