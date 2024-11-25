package com.venilson.campeonato_brasileiro.services;

import com.venilson.campeonato_brasileiro.entities.Clube;
import com.venilson.campeonato_brasileiro.entities.Jogador;
import com.venilson.campeonato_brasileiro.repositories.ClubeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ClubeService {
    @Autowired
    private ClubeRepository clubeRepository;

    public List<Clube> listarClubes(){
        return clubeRepository.findAll();
    }

    public List<Jogador> listarJogadorPorClube(Long id){
        Optional<Clube> clubeOptional = clubeRepository.findById(id);
        if(clubeOptional.isPresent()){
            return clubeOptional.get().getJogadores();
        }
        else{
            return Collections.emptyList();
        }
    }

    public Clube buscarClubePorNome(String clube){
        return clubeRepository.findClubeByNome(clube);
    }

    public Optional<Clube> buscarClubePorId(Long id){
        return Optional.of(clubeRepository.findById(id).get());
    }

    public void adicionarClube(Clube clube){
        clubeRepository.save(clube);
    }
}
