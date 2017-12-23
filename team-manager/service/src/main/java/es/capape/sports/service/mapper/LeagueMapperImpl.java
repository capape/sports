package es.capape.sports.service.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import es.capape.sports.domain.League;
import es.capape.sports.model.dto.LeagueDTO;

@Component("leagueMapper")
public class LeagueMapperImpl implements LeagueMapper {

    @Override
    public List<League> createLeaguesFromLeaguesVO(List<LeagueDTO> leagues) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<LeagueDTO> createLeaguesVOFromLeagues(List<League> leagues) {
        // TODO Auto-generated method stub
        return null;
    }

}
