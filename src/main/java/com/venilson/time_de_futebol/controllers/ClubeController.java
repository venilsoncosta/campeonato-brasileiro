package com.venilson.time_de_futebol.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.venilson.time_de_futebol.models.Clube;
import com.venilson.time_de_futebol.services.ClubeService;

@RestController
@RequestMapping("/clubes")
public class ClubeController {

    private ClubeService clubeService;
    
    public ClubeController(ClubeService clubeService) {
        this.clubeService = clubeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Clube criarClube(@RequestBody Clube clube) {
        return clubeService.saveClube(clube);
    }

    @PostMapping("/batch")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Clube> criarVariosClubes(@RequestBody List<Clube> clubes) {
        return clubeService.saveAllClubes(clubes);
    }

    @GetMapping
    public List<Clube> findAllClubes() {
        return clubeService.findAllClubes();
    }
    
}
