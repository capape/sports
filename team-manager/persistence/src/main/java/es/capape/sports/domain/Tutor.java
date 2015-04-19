package es.capape.sports.domain;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * Entity implementation class for Entity: Tutor
 *
 */
@Entity
public class Tutor extends Person implements Serializable {

    private static final long serialVersionUID = 1L;

    public Tutor() {
        super();
    }

}
