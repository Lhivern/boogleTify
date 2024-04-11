package br.dev.boogletify.model.audios;

import br.dev.boogletify.model.usuarios.Usuario;

public class Musica {
    private String letra;
    private Usuario compositor;

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Usuario getCompositor() {
        return compositor;
    }

    public void setCompositor(Usuario compositor) {
        this.compositor = compositor;
    }
}
