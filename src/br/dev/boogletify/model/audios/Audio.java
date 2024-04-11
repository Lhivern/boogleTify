package br.dev.boogletify.model.audios;

import br.dev.boogletify.model.usuarios.Usuario;

public class Audio {
    private String nome;
    private double duracao;
    private int ouvintes;
    private Usuario autor;
    private int somaAvaliacoes;
    private int quantidadeAvaliacoes;
    private double mediaAvaliacoes;

    public Audio() {
        this.nome = "Empty";
        this.duracao = -1;
        this.ouvintes = -1;
        this.somaAvaliacoes = 0;
        this.mediaAvaliacoes = 0;
    }

    public void avalia(int avaliacao){
        somaAvaliacoes += avaliacao;
        quantidadeAvaliacoes++;
    }

    public void calculaMedia(){
        mediaAvaliacoes = (double) somaAvaliacoes / quantidadeAvaliacoes;
    }

    public double getMediaAvaliacoes(){
        return mediaAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getOuvintes() {
        return ouvintes;
    }

    public void setOuvintes(int ouvintes) {
        this.ouvintes = ouvintes;
    }

    public Usuario getAutor() {
        return autor;
    }

    public void setAutor(Usuario autor) {
        this.autor = autor;
    }
}
