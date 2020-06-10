package br.com.garagem.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="modelo")
public class Modelo {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "marca_id")
    private Marca marca_id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "ano")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ano;

    public Modelo() {
    }

    public Modelo(Marca marca_id, String nome,  String descricao, LocalDate ano) {
        this.marca_id = marca_id;
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Marca getMarca_id() {
        return marca_id;
    }

    public void setMarca_id(Marca marca_id) {
        this.marca_id = marca_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }
}
