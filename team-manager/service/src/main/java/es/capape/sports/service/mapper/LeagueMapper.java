package es.capape.sports.service.mapper;

import java.util.List;

import es.capape.sports.domain.League;
import es.capape.sports.model.vo.LeagueVO;

public interface LeagueMapper {

    List<League> createLeaguesFromLeaguesVO(List<LeagueVO> leagues);

    List<LeagueVO> createLeaguesVOFromLeagues(List<League> leagues);

}
