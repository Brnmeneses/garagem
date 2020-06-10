package br.com.garagem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="fabricante")
public class Fabricante {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    public Fabricante() {
    }

    public Fabricante(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() { return descricao; }

    public void setDescricao(String descricao) { this.descricao = descricao; }
}
