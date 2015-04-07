package es.capape.sports.model;

import java.io.Serializable;

public class TeamVO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    public TeamVO(Integer id) {
        this.setId(id);
    }

    public String toString() {
        return "id: " + getId();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
