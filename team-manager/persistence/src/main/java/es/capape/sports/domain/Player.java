package es.capape.sports.domain;

import java.util.Date;
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
    private Date birthday;

    @ManyToMany
    @JoinTable(name = "PLAYER_REPRESENTANT")
    private List<Representant> representants;

    @ManyToMany
    @JoinTable(name = "PLAYER_TUTOR")
    private List<Representant> tutors;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Representant> getRepresentants() {
        return representants;
    }

    public void setRepresentants(List<Representant> representants) {
        this.representants = representants;
    }

    public List<Representant> getTutors() {
        return tutors;
    }

    public void setTutors(List<Representant> tutors) {
        this.tutors = tutors;
    }

}
