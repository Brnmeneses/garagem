package br.com.garagem.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="mini")
public class Mini {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "fabricante_id")
    private Fabricante fabricante_id;

    @Column(name = "colecao")
    private String colecao;

    @Column(name = "ano")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate ano;

    @Column(name = "cor")
    private String cor;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private Modelo modelo_id;

    public Mini() {
    }

    public Mini(Fabricante fabricante_id, String colecao, LocalDate ano, String cor, Modelo modelo_id) {
        this.fabricante_id = fabricante_id;
        this.colecao = colecao;
        this.ano = ano;
        this.cor = cor;
        this.modelo_id = modelo_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Fabricante getFabricante_id() {
        return fabricante_id;
    }

    public void setFabricante_id(Fabricante fabricante_id) {
        this.fabricante_id = fabricante_id;
    }

    public String getColecao() {
        return colecao;
    }

    public void setColecao(String colecao) {
        this.colecao = colecao;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Modelo getModelo_id() {
        return modelo_id;
    }

    public void setModelo_id(Modelo modelo_id) {
        this.modelo_id = modelo_id;
    }
}
