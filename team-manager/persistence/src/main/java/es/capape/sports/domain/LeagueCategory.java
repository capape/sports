package es.capape.sports.domain;

import static javax.persistence.GenerationType.AUTO;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LeagueCategory implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2043347957624410877L;

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(unique = true)
    private String name;

    @ManyToOne
    private AgeCategory ageCategory;

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

    public AgeCategory getAgeCategory() {
        return this.ageCategory;
    }

    public void setAgeCategory(final AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

}
