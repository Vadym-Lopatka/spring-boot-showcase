package com.vadymlopatka.app.repository;

import com.vadymlopatka.app.domain.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoRepository extends JpaRepository<Repo, Long> {
}
