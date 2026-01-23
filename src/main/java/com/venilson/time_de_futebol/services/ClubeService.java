package com.venilson.time_de_futebol.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.venilson.time_de_futebol.Repositories.ClubeRepository;
import com.venilson.time_de_futebol.models.Clube;

@Service
public class ClubeService {
    
    private ClubeRepository clubeRepository;

    public ClubeService(ClubeRepository clubeRepository) {
        this.clubeRepository = clubeRepository;
    }


    public Clube salvarClube(Clube clube) {
        return clubeRepository.save(clube);
    }

    public Clube buscarClubePorId(Long id) {
        return clubeRepository.findById(id).orElseThrow(() -> new RuntimeException("Clube não encontrado"));
    }

    public Clube findClubeByNome(String nome) {
        return clubeRepository.findByNome(nome);
    }

    public List<Clube> listarClubes() {
        return clubeRepository.findAll();
    }

    public void deletarClube(Long id){
        clubeRepository.deleteById(id);
    }

    public void deletarClubePorNome(String nome) {
        clubeRepository.deleteByNome(nome);
    }
}
