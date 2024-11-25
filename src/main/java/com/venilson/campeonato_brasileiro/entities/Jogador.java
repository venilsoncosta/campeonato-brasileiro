package com.venilson.campeonato_brasileiro.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @Min(0) @NotNull
    private int golsMarcados;
    @Min(0) @NotNull
    private int cartoesAmarelos;
    @Min(0) @NotNull
    private int cartaoVermelho;

    @ManyToOne
    @JoinColumn(name = "time_id")
    @JsonBackReference
    private Clube time;
}
