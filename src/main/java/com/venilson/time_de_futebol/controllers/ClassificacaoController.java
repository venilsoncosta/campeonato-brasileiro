package com.venilson.time_de_futebol.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venilson.time_de_futebol.dto.ClubeDto;
import com.venilson.time_de_futebol.services.ClubeService;

@RestController
@RequestMapping("/classificacao")
public class ClassificacaoController {
    
    private ClubeService clubeService;

    public ClassificacaoController(ClubeService clubeService) {
        this.clubeService = clubeService;
    }

    @GetMapping
    public List<ClubeDto> getTabela() {
        return clubeService.getClassificacao();
    }

}
