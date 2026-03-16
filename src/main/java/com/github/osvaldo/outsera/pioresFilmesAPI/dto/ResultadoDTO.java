package com.github.osvaldo.outsera.pioresFilmesAPI.dto;

import java.util.List;

public class ResultadoDTO {

    private List<IntervaloDTO> menorIntervalo;
    private List<IntervaloDTO> maiorIntervalo;

    public List<IntervaloDTO> getMenorIntervalo() {
        return menorIntervalo;
    }

    public void setMenorIntervalo(List<IntervaloDTO> menorIntervalo) {
        this.menorIntervalo = menorIntervalo;
    }

    public List<IntervaloDTO> getMaiorIntervalo() {
        return maiorIntervalo;
    }

    public void setMaiorIntervalo(List<IntervaloDTO> maiorIntervalo) {
        this.maiorIntervalo = maiorIntervalo;
    }


}
