package com.catrpg.catrpg.repository;

import com.catrpg.catrpg.model.Damage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DamageRepository extends JpaRepository<Damage, Long> {
}
