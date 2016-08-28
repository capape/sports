package es.capape.sports.model.vo;

import java.io.Serializable;
import java.util.List;

public class LeagueVO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1377666907480369906L;

    public Long id;

    public String name;

    public List<TeamVO> competitors;

    public LeagueCategoryVO category;
}
