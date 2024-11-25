package com.venilson.campeonato_brasileiro.repositories;

import com.venilson.campeonato_brasileiro.entities.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {

    Jogador findByNome(String nome);

}
