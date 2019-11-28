package br.com.gsete.models;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "CAIXA")
public class Caixa extends EntidadeBase {

    @Column(name="nome", nullable = false, unique = true)
    @NotNull(message = "{caixa.nome.notNull}")
    @Size(min = 3, max = 50, message = "{caixa.nome.size}")
    @JsonProperty(value = "nome", required = true)
    private String nome;

    @Column(name = "saldo", nullable = true, unique = false)
    @JsonProperty(value = "saldo", required = false)
    private Double saldo;

    @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "caixa_id")
	@JsonProperty(value = "entradas", required = false)
    private Set<Entrada> entradas = new HashSet<Entrada>();

    @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "caixa_id")
	@JsonProperty(value = "saidas", required = false)
    private Set<Saida> saidas = new HashSet<Saida>();

    @Column(name="observacoes", nullable = true, unique = false)
    @Size(min = 3, max = 200, message = "{caixa.observacoes.size}")
    @JsonProperty(value = "observacoes", required = true)
    private String observacoes;

    public Caixa() {}


    public Caixa(String nome, Double saldo, String observacoes) {
        this.nome = nome;
        this.saldo = saldo;
        this.observacoes = observacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getObservacoes() {
        return this.observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Caixa nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Caixa saldo(Double saldo) {
        this.saldo = saldo;
        return this;
    }

    public Caixa observacoes(String observacoes) {
        this.observacoes = observacoes;
        return this;
    }

    public void atualizarSaldo() {
        Double saldoAtualizado = 0.0;
        for (Entrada entrada : entradas) {
            entrada.atualizarEntrada();
            saldoAtualizado += entrada.getValor();
        }
        for (Saida saida : saidas) {
            saldoAtualizado -= saida.getValor();
        }
        saldo = saldoAtualizado;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", saldo='" + getSaldo() + "'" +
            ", observacoes='" + getObservacoes() + "'" +
            "}";
    }
}