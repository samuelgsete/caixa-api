package br.com.gsete.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "PENDENCIA")
public class Pendencia extends EntidadeBase {

    @Column(name="titular", nullable = false, unique = false)
    @NotNull(message = "{pendencia.titular.notNull}")
    @Size(min = 3, max = 50, message = "{pendencia.titular.size}")
    @JsonProperty(value = "titular", required = true)
    private String titular;

    @Column(name="valor", nullable = false, unique = false)
    @NotNull(message = "{pendencia.valor.notNull}")
    @JsonProperty(value = "valor", required = true)
    private Double valor;

    @Column(name="situacao", nullable = false, unique = false)
    @NotNull(message = "{pendencia.status.notNull}")
    @Enumerated(EnumType.STRING)
    @JsonProperty(value = "situacao", required = true)
    private StatusPendencia situacao;

    public Pendencia() {

    }
}