package br.com.garagem.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="marca")
public class Marca {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais_id;

    @Column(name = "ano")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ano;

    public Marca() {
    }

    public Marca(String nome, Pais pais_id, LocalDate ano) {
        this.nome = nome;
        this.pais_id = pais_id;
        this.ano = ano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String marca) {
        this.nome = marca;
    }

    public Pais getPais_id() {
        return pais_id;
    }

    public void setPais_id(Pais pais_id) {
        this.pais_id = pais_id;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }
}
