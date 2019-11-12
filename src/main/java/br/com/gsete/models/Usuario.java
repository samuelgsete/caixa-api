package br.com.gsete.models;


public class Usuario extends EntidadeBase {
    public String nome;
    public int idade;

    public Usuario() { 
        this.nome = "Samuel";
        this.idade = 24;
    }

    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Usuario nome(String nome) {
        this.nome = nome;
        return this;
    }

    public Usuario idade(int idade) {
        this.idade = idade;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            "}";
    }

    
}