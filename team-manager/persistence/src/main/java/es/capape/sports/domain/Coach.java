package es.capape.sports.domain;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Represents a coach
 *
 * @author Antonio Capapé
 *
 */
@Entity
public class Coach extends Person {

    /**
     *
     */
    private static final long serialVersionUID = -4469154980438766665L;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Team> trainee;

    @ManyToOne
    private Club club;

    public List<Team> getTrainee() {
        return this.trainee;
    }

    public void setTrainee(final List<Team> trainee) {
        this.trainee = trainee;
    }

    public Club getClub() {
        return this.club;
    }

    public void setClub(final Club club) {
        this.club = club;
    }

}
