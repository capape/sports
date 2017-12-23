package es.capape.sports.service.mapper;

import java.util.List;

import es.capape.sports.domain.League;
import es.capape.sports.model.dto.LeagueDTO;

public interface LeagueMapper {

    List<League> createLeaguesFromLeaguesVO(List<LeagueDTO> leagues);

    List<LeagueDTO> createLeaguesVOFromLeagues(List<League> leagues);

}
