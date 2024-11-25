package com.venilson.campeonato_brasileiro.controllers;

import com.venilson.campeonato_brasileiro.entities.Jogador;
import com.venilson.campeonato_brasileiro.services.JogadorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogador")
public class JogadorController {
    @Autowired
    private JogadorService jogadorService;

    @GetMapping("/listar")
    public List<Jogador> listarJogadores(){
        return jogadorService.listarTodosJogadores();
    }

    @GetMapping("/{nome}")
    public Jogador buscarJogadorPorNome(@Valid @PathVariable String nome){
        return jogadorService.buscarJogadorPorNome(nome);
    }

    @PostMapping
    public void adicionarJogador(@Valid @RequestBody Jogador jogador){
        jogadorService.adicionarJogador(jogador);
    }
}
