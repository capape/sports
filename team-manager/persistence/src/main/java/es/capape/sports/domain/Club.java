package es.capape.sports.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Entity which represents a club. A club have several at least one team.
 *
 * @author Antonio Capapé
 *
 */
@Entity
public class Club implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 3856200212109362563L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column
    private String site;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Team> teams;

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

    public String getSite() {
        return this.site;
    }

    public void setSite(final String site) {
        this.site = site;
    }

    public List<Team> getTeams() {
        return this.teams;
    }

    public void setTeams(final List<Team> teams) {
        this.teams = teams;
    }

}
