package es.capape.sports.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surnames;

    @Column
    private String idCard;

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

    public String getSurnames() {
        return this.surnames;
    }

    public void setSurnames(final String surnames) {
        this.surnames = surnames;
    }

    public String getIdCard() {
        return this.idCard;
    }

    public void setIdCard(final String idCard) {
        this.idCard = idCard;
    }

}
