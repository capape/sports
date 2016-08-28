package es.capape.sports.model.vo;

import java.io.Serializable;

public class LeagueCategoryVO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -9091115328475297133L;

    public Long id;

    public String name;

    public AgeCategoryVO ageCategory;
}
