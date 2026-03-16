package com.github.osvaldo.outsera.pioresFilmesAPI.controller;

import com.github.osvaldo.outsera.pioresFilmesAPI.dto.ResultadoDTO;
import com.github.osvaldo.outsera.pioresFilmesAPI.repository.FilmeRepository;
import com.github.osvaldo.outsera.pioresFilmesAPI.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("filme")
public class FilmeController {

    private FilmeRepository filmeRepository;

    @Autowired
    private FilmeService filmeService;

    public FilmeController(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    @GetMapping("/produtor/intervalo")
    public ResultadoDTO intervalo(){
        return filmeService.calculaIntervalo();
    }
}
