package es.capape.sports.domain;

import static javax.persistence.GenerationType.AUTO;

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
public class Team {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    private AgeCategory category;

    @ManyToMany
    private List<League> competetions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AgeCategory getCategory() {
        return category;
    }

    public void setCategory(AgeCategory category) {
        this.category = category;
    }

    public List<League> getCompetetions() {
        return competetions;
    }

    public void setCompetetions(List<League> competetions) {
        this.competetions = competetions;
    }

}
