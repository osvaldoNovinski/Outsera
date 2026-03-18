package com.github.osvaldo.outsera.pioresFilmesAPI.service;


import com.github.osvaldo.outsera.pioresFilmesAPI.model.Filme;
import com.github.osvaldo.outsera.pioresFilmesAPI.repository.FilmeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@Service
public class PopulaBancoService {

    @Autowired
    private FilmeRepository repository;

    private static final Logger log = LoggerFactory.getLogger(PopulaBancoService.class);

    public void leitura() {
        String caminho = "src/main/resources/banco/litaFilme.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha;

            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(";");
                Filme filme = new Filme(
                        Long.parseLong(colunas[0]),
                        colunas[1],
                        colunas[2],
                        colunas[3],
                        colunas.length > 4 ? colunas[4] : null
                );

                repository.save(filme);
            }

        } catch (IOException e) {
            log.error("Erro ao carregar arquivo CSV", e);
        }
    }
}
