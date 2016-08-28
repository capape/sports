/**
 *
 */
package es.capape.sports.domain;

import static javax.persistence.GenerationType.AUTO;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Represents an age category for a competition. Competitions use to be
 * organized on age groups or categories.
 *
 * @author Antonio Capapé Gil
 *
 */
@Entity
public class AgeCategory implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 5706233570035564480L;

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

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

}
