package com.venilson.campeonato_brasileiro.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "jogadores")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String posicao;

    @Min(0) @NotBlank
    private int golsMarcados;
    @Min(0) @NotBlank
    private int cartoesAmarelos;
    @Min(0) @NotBlank
    private int cartaoVermelho;

    @ManyToOne
    @JoinColumn(name = "time_id")
    private Clube time;
}
