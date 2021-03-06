package br.com.garagem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="pais")
public class Pais {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "nome")
    private String nome;

    public Pais() {
    }

    public Pais(String nome) {
        super();
        this.nome = nome;
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
}
