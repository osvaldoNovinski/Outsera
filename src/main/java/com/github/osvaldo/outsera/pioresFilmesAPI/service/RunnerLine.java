package com.github.osvaldo.outsera.pioresFilmesAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RunnerLine implements CommandLineRunner {

    @Autowired
    private PopulaBancoService service;

    @Override
    public void run(String... args) throws Exception {
        service.leitura();
    }
}
