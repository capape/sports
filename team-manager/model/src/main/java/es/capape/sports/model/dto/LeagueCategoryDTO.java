package es.capape.sports.model.dto;

import java.io.Serializable;

public class LeagueCategoryDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -9091115328475297133L;

    public Long id;

    public String name;

    public AgeCategoryDTO ageCategory;
}
