package com.github.osvaldo.outsera.pioresFilmesAPI.model;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "ano")
    private Long ano;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "estudio")
    private String estudio;
    @Column(name = "produtor")
    private String produtor;
    @Column(name = "vencedor")
    private String vencedor;

    public Filme() {
    }

    public Filme(Long ano, String titulo, String estudio, String produtor, String vencedor) {
        this.ano = ano;
        this.titulo = titulo;
        this.estudio = estudio;
        this.produtor = produtor;
        this.vencedor = vencedor;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    @Override
    public String toString() {
        return "Filme{" +
                ", ano=" + ano +
                ", titulo='" + titulo + '\'' +
                ", estudio='" + estudio + '\'' +
                ", produtor='" + produtor + '\'' +
                ", vencedor='" + vencedor + '\'' +
                '}';
    }
}
