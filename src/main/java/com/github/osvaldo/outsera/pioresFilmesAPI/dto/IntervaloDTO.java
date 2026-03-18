package com.github.osvaldo.outsera.pioresFilmesAPI.dto;


public class IntervaloDTO {

    private String producer;
    private Long interval;
    private Long previousWin;
    private Long followingWin;

    public IntervaloDTO() {
    }

    public IntervaloDTO(String produtor, Long intervalo, Long ultimoGanho, Long proximoGanho) {
        this.producer = produtor;
        this.interval = intervalo;
        this.previousWin = ultimoGanho;
        this.followingWin = proximoGanho;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public Long getPreviousWin() {
        return previousWin;
    }

    public void setPreviousWin(Long previousWin) {
        this.previousWin = previousWin;
    }

    public Long getFollowingWin() {
        return followingWin;
    }

    public void setFollowingWin(Long followingWin) {
        this.followingWin = followingWin;
    }
}
