package br.com.gsete.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "SAIDA")
public class Saida extends Movimentacao {

    @Column(name="observacoes", nullable = true, unique = false)
    @Size(max = 250, message = "{saida.observacoes.size}")
    @JsonProperty(value = "observacoes", required = true)
    private String observacoes;

    public Saida() { }

    public Saida(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Saida observacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " observacoes='" + getObservacoes() + "'" +
            "}";
    }

}