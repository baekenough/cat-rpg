package com.catrpg.catrpg.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Cat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long catNid;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "damage_nid")
    private Damage damage; //데미지
    private Long health; //체력
    private int healthRecover; //초당 체력회복량
    private Long criticalDamage; //치명타데미지
    private int criticalRate; //치명타확률
    private int doubleshotRate; //
    private int tripleshotRate;

}
