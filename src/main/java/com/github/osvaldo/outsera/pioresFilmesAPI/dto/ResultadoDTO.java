package com.github.osvaldo.outsera.pioresFilmesAPI.dto;

import java.util.List;

public class ResultadoDTO {

    private List<IntervaloDTO> min;
    private List<IntervaloDTO> max;

    public List<IntervaloDTO> getMin() {
        return min;
    }

    public void setMin(List<IntervaloDTO> min) {
        this.min = min;
    }

    public List<IntervaloDTO> getMax() {
        return max;
    }

    public void setMax(List<IntervaloDTO> max) {
        this.max = max;
    }


}
