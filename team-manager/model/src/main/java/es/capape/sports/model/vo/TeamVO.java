package es.capape.sports.model.vo;

import java.io.Serializable;
import java.util.List;

public class TeamVO implements Serializable {

    private static final long serialVersionUID = -7362045273415984710L;

    public Long id;

    public String name;

    public AgeCategoryVO category;

    public List<LeagueVO> leagues;
}
