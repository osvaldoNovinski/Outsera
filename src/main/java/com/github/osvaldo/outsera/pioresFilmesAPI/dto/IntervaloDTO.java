package com.github.osvaldo.outsera.pioresFilmesAPI.dto;


public class IntervaloDTO {

    private String produtor;
    private Long intervalo;
    private Long ultimoGanho;
    private Long proximoGanho;

    public IntervaloDTO() {
    }

    public IntervaloDTO(String produtor, Long intervalo, Long ultimoGanho, Long proximoGanho) {
        this.produtor = produtor;
        this.intervalo = intervalo;
        this.ultimoGanho = ultimoGanho;
        this.proximoGanho = proximoGanho;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public Long getIntervalo() {
        return intervalo;
    }

    public void setIntervalo(Long intervalo) {
        this.intervalo = intervalo;
    }

    public Long getUltimoGanho() {
        return ultimoGanho;
    }

    public void setUltimoGanho(Long ultimoGanho) {
        this.ultimoGanho = ultimoGanho;
    }

    public Long getProximoGanho() {
        return proximoGanho;
    }

    public void setProximoGanho(Long proximoGanho) {
        this.proximoGanho = proximoGanho;
    }
}
