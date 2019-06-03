package com.vadymlopatka.app.repository;

import com.vadymlopatka.app.domain.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {

    /*@Query(value = "select a, e.createdAt, count(e.id) as events " +
            "from Actor a " +
            "left join a.events e " +
            "group by a " +
            "order by count(e.id) desc, e.createdAt desc, a.login asc")
    List<Actor> findAllOrderedByEventsCount();*/
}
