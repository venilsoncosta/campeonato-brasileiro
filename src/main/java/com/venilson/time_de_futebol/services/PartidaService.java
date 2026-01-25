package com.venilson.time_de_futebol.services;

import org.springframework.stereotype.Service;

import com.venilson.time_de_futebol.Repositories.ClubeRepository;
import com.venilson.time_de_futebol.Repositories.PartidaRepository;
import com.venilson.time_de_futebol.exceptions.ResourceNotFoundException;
import com.venilson.time_de_futebol.models.Clube;
import com.venilson.time_de_futebol.models.Partida;

import jakarta.transaction.Transactional;

@Service
public class PartidaService {
    
    private PartidaRepository partidaRepository;

    private ClubeRepository clubeRepository;

    public PartidaService(PartidaRepository partidaRepository, ClubeRepository clubeRepository) {
        this.partidaRepository = partidaRepository;
        this.clubeRepository = clubeRepository;
    }

    @Transactional
    public Partida cadastrarPartida(Partida partida) {
        
        Clube mandante = clubeRepository.findById(partida.getMandante().getId())
            .orElseThrow(() -> new ResourceNotFoundException("Clube mandante não encontrado"));
        Clube visitante = clubeRepository.findById(partida.getVisitante().getId())
            .orElseThrow(() -> new ResourceNotFoundException("Clube visitante não encontrado"));

        processarResultado(mandante, visitante, partida.getGolsMandante(), partida.getGolsVisitante());

        
        clubeRepository.save(mandante);
        clubeRepository.save(visitante);

    
        return partidaRepository.save(partida);
    }

    private void processarResultado(Clube mandante, Clube visitante, int golsMandante, int golsVisitante) {

        mandante.setGolsMarcados(mandante.getGolsMarcados() + golsMandante);
        visitante.setGolsMarcados(visitante.getGolsMarcados() + golsVisitante);

        mandante.setGolsSofridos(mandante.getGolsSofridos() + golsVisitante);
        visitante.setGolsSofridos(visitante.getGolsSofridos() + golsMandante);

        if (golsMandante > golsVisitante) { 
            mandante.setPontos(mandante.getPontos() + 3);
            mandante.setVitorias(mandante.getVitorias() + 1);
            visitante.setDerrotas(visitante.getDerrotas() + 1);

        } else if (golsVisitante > golsMandante) { 

            visitante.setPontos(visitante.getPontos() + 3);
            visitante.setVitorias(visitante.getVitorias() + 1);
            mandante.setDerrotas(mandante.getDerrotas() + 1);

        } else { 
            mandante.setPontos(mandante.getPontos() + 1);
            visitante.setPontos(visitante.getPontos() + 1);
            mandante.setEmpates(mandante.getEmpates() + 1);
            visitante.setEmpates(visitante.getEmpates() + 1);
        }

    }
}
