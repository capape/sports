package es.capape.sports.domain;

import static javax.persistence.GenerationType.AUTO;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class League {

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

    public List<Team> getCompetitors() {
        return competitors;
    }

    public void setCompetitors(List<Team> competitors) {
        this.competitors = competitors;
    }

    public LeagueCategory getCategory() {
        return category;
    }

    public void setCategory(LeagueCategory category) {
        this.category = category;
    }
}
