package com.venilson.time_de_futebol.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venilson.time_de_futebol.models.Partida;
import com.venilson.time_de_futebol.services.PartidaService;

@RestController
@RequestMapping("/partidas")
public class PartidaController {
    
    private PartidaService partidaService;

    public PartidaController(PartidaService partidaService) {
        this.partidaService = partidaService;
    }

    @PostMapping
    public ResponseEntity<Partida> cadastrarPartida(@RequestBody Partida partida){

        Partida novaPartida = partidaService.cadastrarPartida(partida);

        return ResponseEntity.status(HttpStatus.CREATED).body(novaPartida);

    }

}
