package br.com.gsete.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@MappedSuperclass
public abstract class Movimentacao extends EntidadeBase {
    
    @Column(name="descricao", nullable = false, unique = false)
    @NotNull(message = "{movimentacao.descricao.notNull}")
    @Size(min = 3, max = 50, message = "{movimentacao.descricao.size}")
    @JsonProperty(value = "descricao", required = true)
    private String descricao;

    @Column(name="data", nullable = false, unique = false)
    @Temporal(TemporalType.DATE)
    @NotNull(message = "{movimentacao.data.notNull}")
    @JsonProperty(value = "data", required = true)
    private Date data;

    @Column(name="valor", nullable = false, unique = false)
    @NotNull(message = "{movimentacao.valor.notNull}")
    @JsonProperty(value = "valor", required = true)
    private Double valor;

    public Movimentacao() { }


    public Movimentacao(String descricao, Date data, Double valor) {
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Movimentacao descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public Movimentacao data(Date data) {
        this.data = data;
        return this;
    }

    public Movimentacao valor(Double valor) {
        this.valor = valor;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " descricao='" + getDescricao() + "'" +
            ", data='" + getData() + "'" +
            ", valor='" + getValor() + "'" +
            "}";
    }
}