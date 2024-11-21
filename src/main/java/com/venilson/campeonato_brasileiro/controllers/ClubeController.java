package com.venilson.campeonato_brasileiro.controllers;

import com.venilson.campeonato_brasileiro.entities.Clube;
import com.venilson.campeonato_brasileiro.services.ClubeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubes")
public class ClubeController {
    @Autowired
    private ClubeService clubeService;

    @GetMapping
    public List<Clube> listarClubes(){
        return clubeService.listarClubes();
    }
    @PostMapping
    public void adicionarClube(@Valid @RequestBody Clube clube){
        clubeService.adicionarClube(clube);
    }
}
