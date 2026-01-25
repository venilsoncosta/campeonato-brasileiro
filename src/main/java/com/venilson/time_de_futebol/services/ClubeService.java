package com.venilson.time_de_futebol.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.venilson.time_de_futebol.Repositories.ClubeRepository;
import com.venilson.time_de_futebol.exceptions.ResourceNotFoundException;
import com.venilson.time_de_futebol.models.Clube;

@Service
public class ClubeService {
    
    private ClubeRepository clubeRepository;

    public ClubeService(ClubeRepository clubeRepository) {
        this.clubeRepository = clubeRepository;
    }


    public Clube saveClube(Clube clube) {
        return clubeRepository.save(clube);
    }

    public Clube findById(Long id) {
        return clubeRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Clube não encontrado"));
    }

    public Clube findByNome(String nome) {
        return clubeRepository.findByNome(nome);
    }

    public List<Clube> findAllClubes() {
        return clubeRepository.findAll();
    }

    public void deleteClubeById(Long id){

        if(!clubeRepository.existsById(id)){
            throw new ResourceNotFoundException("Não foi possível deletar: Clube não encontrado");
        }
        clubeRepository.deleteById(id);
    }

    public void deleteClubeByNome(String nome) {
        clubeRepository.deleteByNome(nome);
    }
}
