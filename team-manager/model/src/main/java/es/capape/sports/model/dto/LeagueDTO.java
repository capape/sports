package es.capape.sports.model.dto;

import java.io.Serializable;
import java.util.List;

public class LeagueDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1377666907480369906L;

    public Long id;

    public String name;

    public List<TeamDTO> competitors;

    public LeagueCategoryDTO category;
}
