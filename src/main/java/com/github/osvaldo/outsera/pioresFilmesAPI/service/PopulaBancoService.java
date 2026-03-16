package com.github.osvaldo.outsera.pioresFilmesAPI.service;


import com.github.osvaldo.outsera.pioresFilmesAPI.model.Filme;
import com.github.osvaldo.outsera.pioresFilmesAPI.repository.FilmeRepository;
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


    public void leitura() {
        String caminho = "src/main/resources/banco/litaFilme.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha;

            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split(";");
                Filme filme = new Filme(
                        Long.parseLong(colunas[0]),
                        Long.parseLong(colunas[1]),
                        colunas[2],
                        colunas[3],
                        colunas[4],
                        colunas.length > 5 ? colunas[5] : null
                );

                repository.save(filme);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
