package es.capape.sports.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

/**
 * Entity implementation class for Entity: Representant
 *
 */
@Entity
public class Representant extends Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToMany
    private List<Player> represents;

    public Representant() {
        super();
    }

}
