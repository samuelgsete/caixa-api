package br.com.gsete.exceptions.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Erro {
	@JsonProperty(value = "Tipo")
	private String tipo;
	@JsonProperty(value = "Codigo")
	private String codigo;
	@JsonProperty(value = "mensagem")
	private String mensagem;
	@JsonProperty(value = "detalhes")
	private String detalhes;
	
	public Erro() { }
	
	public Erro(String tipo, String codigo, String mensagem, String detalhes) {
		this.tipo = tipo;
		this.codigo = codigo;
		this.mensagem = mensagem;
		this.detalhes = detalhes;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Erro [tipo=" + tipo + ", codigo=" + codigo + ", mensagem=" + mensagem + ", detalhes=" + detalhes + "]";
	}
}
