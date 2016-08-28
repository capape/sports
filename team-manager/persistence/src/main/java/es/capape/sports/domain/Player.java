package es.capape.sports.domain;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 * Represents a player
 *
 * @author Antonio Capapé
 *
 */
@Entity
public class Player extends Person {

    /**
     *
     */
    private static final long serialVersionUID = -5085973441097983864L;

    @ManyToOne
    private Team team;

    @Column
    private Integer height;

    @Column
    private Integer weight;

    @Column(nullable = false)
    private LocalDate birthday;

    @ManyToMany
    @JoinTable(name = "PLAYER_REPRESENTANT")
    private List<Representant> representants;

    @ManyToMany
    @JoinTable(name = "PLAYER_TUTOR")
    private List<Representant> tutors;

    public Team getTeam() {
        return this.team;
    }

    public void setTeam(final Team team) {
        this.team = team;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(final Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return this.weight;
    }

    public void setWeight(final Integer weight) {
        this.weight = weight;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public void setBirthday(final LocalDate birthday) {
        this.birthday = birthday;
    }

    public List<Representant> getRepresentants() {
        return this.representants;
    }

    public void setRepresentants(final List<Representant> representants) {
        this.representants = representants;
    }

    public List<Representant> getTutors() {
        return this.tutors;
    }

    public void setTutors(final List<Representant> tutors) {
        this.tutors = tutors;
    }

}
