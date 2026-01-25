package com.venilson.time_de_futebol.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venilson.time_de_futebol.models.Partida;

public interface PartidaRepository extends JpaRepository<Partida, Long>{
    
}
