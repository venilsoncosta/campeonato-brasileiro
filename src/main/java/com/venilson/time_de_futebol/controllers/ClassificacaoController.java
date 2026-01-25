package com.venilson.time_de_futebol.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venilson.time_de_futebol.Repositories.ClubeRepository;
import com.venilson.time_de_futebol.models.Clube;

@RestController
@RequestMapping("/classificacao")
public class ClassificacaoController {
    
    private ClubeRepository clubeRepository;

    public ClassificacaoController(ClubeRepository clubeRepository) {
        this.clubeRepository = clubeRepository;
    }

    @GetMapping
    public List<Clube> getTabela() {
        return clubeRepository.findAllByOrderByPontosDescVitoriasDescGolsMarcadosDesc();
    }

}
