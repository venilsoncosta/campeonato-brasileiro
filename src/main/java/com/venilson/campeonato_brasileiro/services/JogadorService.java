package com.venilson.campeonato_brasileiro.services;

import com.venilson.campeonato_brasileiro.entities.Jogador;
import com.venilson.campeonato_brasileiro.repositories.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository jogadorRepository;

    public List<Jogador> listarTodosJogadores(){
        return jogadorRepository.findAll();
    }

    public Jogador buscarJogadorPorNome(String jogador){
        return jogadorRepository.findByNome(jogador);
    }

    public void adicionarJogador(Jogador jogador){
        jogadorRepository.save(jogador);
    }
}
