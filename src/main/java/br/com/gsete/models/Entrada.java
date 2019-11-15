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

    public Entrada() { }

}