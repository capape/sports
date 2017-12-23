package es.capape.sports.model.dto;

import java.io.Serializable;
import java.util.List;

public class TeamDTO implements Serializable {

    private static final long serialVersionUID = -7362045273415984710L;

    public Long id;

    public String name;

    public AgeCategoryDTO category;

    public List<LeagueDTO> leagues;
}
