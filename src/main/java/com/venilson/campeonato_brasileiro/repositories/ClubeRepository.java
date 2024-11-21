package com.venilson.campeonato_brasileiro.repositories;

import com.venilson.campeonato_brasileiro.entities.Clube;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClubeRepository extends JpaRepository<Clube, Long> {

    public void findClubeByNome(String name);
}
