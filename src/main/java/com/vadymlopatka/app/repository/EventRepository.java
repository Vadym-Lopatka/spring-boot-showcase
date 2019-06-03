package com.vadymlopatka.app.repository;

import com.vadymlopatka.app.domain.Actor;
import com.vadymlopatka.app.domain.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    List<Event> findAllByActorOrderByIdAsc(Actor actor);
    List<Event> findAllByActorAndTypeOrderByCreatedAtDesc(Actor actor, String type);

    List<Event> findAllByOrderByIdAsc();
}
