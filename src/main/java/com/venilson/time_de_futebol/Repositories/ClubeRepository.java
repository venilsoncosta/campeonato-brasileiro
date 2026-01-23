package com.venilson.time_de_futebol.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.venilson.time_de_futebol.models.Clube;

public interface ClubeRepository extends JpaRepository<Clube, Long> {

    Clube findByNome(String nome);
    
    void deleteByNome(String nome);
}
