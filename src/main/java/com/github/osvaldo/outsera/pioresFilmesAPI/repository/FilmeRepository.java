package com.github.osvaldo.outsera.pioresFilmesAPI.repository;

import com.github.osvaldo.outsera.pioresFilmesAPI.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Long> {

}
