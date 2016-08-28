package es.capape.sports.repositories;

import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import es.capape.sports.domain.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {

    @Query("select t from Team t where t.category.id = :category")
    List<Team> getTeamsByCategory(@Param("category") long category);

    @Query("select t from League l join l.competitors t where l.id=:leagueid")
    List<Team> getTeamsByLeague(@Param("league") long leagueId);

    @Query("select t from Club c join c.teams t where c.id=:clubid")
    List<Team> getTeamsByClub(@Param("clubid") long clubId);

    @Query("select t from Team t where t.name like :name")
    List<Team> getTeamsByName(@Param("name") String name, Pageable page);

}
