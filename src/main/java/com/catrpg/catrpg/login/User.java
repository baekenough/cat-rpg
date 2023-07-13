package com.catrpg.catrpg.login;

import com.catrpg.catrpg.enums.Yn;
import com.catrpg.catrpg.model.Cat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userNid;
    private String socialUUID;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cat_nid")
    private Cat cat;
    private Yn useYn;
    private LocalDateTime createDtm;
    private LocalDateTime updateDtm;

}
