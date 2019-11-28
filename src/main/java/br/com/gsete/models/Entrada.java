package br.com.gsete.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "ENTRADA")
public class Entrada extends Movimentacao {

    @OneToMany(fetch= FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "entrada_id")
	@JsonProperty(value = "pendencias", required = false)
    private Set<Pendencia> pendencias = new HashSet<Pendencia>();


    public Entrada() {
    }

    public Entrada(Set<Pendencia> pendencias) {
        this.pendencias = pendencias;
    }

    public Set<Pendencia> getPendencias() {
        return this.pendencias;
    }

    public void setPendencias(Set<Pendencia> pendencias) {
        this.pendencias = pendencias;
    }

    public Entrada pendencias(Set<Pendencia> pendencias) {
        this.pendencias = pendencias;
        return this;
    }

    public void atualizarEntrada() {
        Double valor = 0.0;
        for (Pendencia pendencia : pendencias) {
            if(pendencia.getSituacao().equals(StatusPendencia.QUITADA)) {
                valor += pendencia.getValor();
            }
        }
        this.valor += valor;
    }

    @Override
    public String toString() {
        return "{" +
            " pendencias='" + getPendencias() + "'" +
            "}";
    }
    

}