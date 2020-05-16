package br.com.garagem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="miniatura")
public class Miniatura {

    @Id
    @GeneratedValue
    private Integer id;

    private String marca;

    private  String modelo;

    public Miniatura() {
    }

    public Miniatura(String marca, String modelo) {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
