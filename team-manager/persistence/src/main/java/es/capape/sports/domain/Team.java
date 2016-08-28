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

/**
 * Represents a Club's Team
 *
 * @author Antonio Capapé
 *
 *
 */
@Entity
public class Team implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -5584901235684966033L;

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private AgeCategory category;

    @ManyToMany
    private List<League> leagues;

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

    public AgeCategory getCategory() {
        return this.category;
    }

    public void setCategory(final AgeCategory category) {
        this.category = category;
    }

    public List<League> getLeagues() {
        return this.leagues;
    }

    public void setLeagues(final List<League> leagues) {
        this.leagues = leagues;
    }

}
