package com.venilson.time_de_futebol.dto;

public class ClubeDto {
    private Long id;
    private String nome;
    private String estadio;

    private Integer pontos;
    private Integer vitorias;
    private Integer empates;
    private Integer derrotas;
    private Integer golsMarcados;
    private Integer golsSofridos;

    
    public ClubeDto() {
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEstadio() {
        return estadio;
    }


    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }


    public Integer getPontos() {
        return pontos;
    }


    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }


    public Integer getVitorias() {
        return vitorias;
    }


    public void setVitorias(Integer vitorias) {
        this.vitorias = vitorias;
    }


    public Integer getEmpates() {
        return empates;
    }


    public void setEmpates(Integer empates) {
        this.empates = empates;
    }


    public Integer getDerrotas() {
        return derrotas;
    }


    public void setDerrotas(Integer derrotas) {
        this.derrotas = derrotas;
    }


    public Integer getGolsMarcados() {
        return golsMarcados;
    }


    public void setGolsMarcados(Integer golsMarcados) {
        this.golsMarcados = golsMarcados;
    }


    public Integer getGolsSofridos() {
        return golsSofridos;
    }


    public void setGolsSofridos(Integer golsSofridos) {
        this.golsSofridos = golsSofridos;
    }

    public int getSaldoGols() {
        return this.golsMarcados - this.golsSofridos;
    }
}
