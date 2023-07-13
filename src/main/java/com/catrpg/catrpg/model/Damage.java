package com.catrpg.catrpg.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Damage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long damageNid;
    private Long damage;
    private Long upDamage;

}
