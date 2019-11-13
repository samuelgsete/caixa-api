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
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "ENTRADA")
public class Entrada extends Movimentacao {

    @Column(name="contribuidor", nullable = true, unique = false)
    @Size(min = 3, max = 50, message = "{entrada.contribuidor.size}")
    @JsonProperty(value = "contribuidor", required = false)
    private String contribuidor;

    @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "entrada_id")
	@JsonProperty(value = "pendencias", required = false)
    private Set<Pendencia> pendencias = new HashSet<Pendencia>();

    public Entrada() { }

    public Entrada(String contribuidor, Set<Pendencia> pendencias) {
        this.contribuidor = contribuidor;
        this.pendencias = pendencias;
    }

    public String getContribuidor() {
        return this.contribuidor;
    }

    public void setContribuidor(String contribuidor) {
        this.contribuidor = contribuidor;
    }

    public Set<Pendencia> getPendencias() {
        return this.pendencias;
    }

    public void setPendencias(Set<Pendencia> pendencias) {
        this.pendencias = pendencias;
    }

    public Entrada contribuidor(String contribuidor) {
        this.contribuidor = contribuidor;
        return this;
    }

    public Entrada pendencias(Set<Pendencia> pendencias) {
        this.pendencias = pendencias;
        return this;
    }
    @Override
    public String toString() {
        return "{" +
            " contribuidor='" + getContribuidor() + "'" +
            ", pendencias='" + getPendencias() + "'" +
            "}";
    }
}