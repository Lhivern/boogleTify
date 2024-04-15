package br.dev.boogletify.model.audios;

import br.dev.boogletify.model.usuarios.Usuario;

public class Podcast extends Audio{
    private String descricao;
    private int quantidadeEpisodios;
    private Usuario host;

    public void adiciona(){
        quantidadeEpisodios++;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
