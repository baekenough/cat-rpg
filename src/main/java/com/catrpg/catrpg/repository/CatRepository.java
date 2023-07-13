package com.catrpg.catrpg.repository;

import com.catrpg.catrpg.model.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, Long> {
}
