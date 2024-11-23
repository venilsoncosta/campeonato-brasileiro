package com.venilson.campeonato_brasileiro.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "clubes")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clube {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String estadio;

    @Min(0) @NotNull
    private int vitorias;

    @Min(0) @NotNull
    private int empates;

    @Min(0) @NotNull
    private int derrotas;

    @Min(0) @NotNull
    private int golsMarcados;

    @Min(0) @NotNull
    private int golsSofridos;

    @NotNull
    private int saldoGols;

    @OneToMany(mappedBy = "time")
    private List<Jogador> jogadores;

}
