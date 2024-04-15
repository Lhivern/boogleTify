package br.dev.boogletify.model.audios;

public class Preferidas {
    private Audio listaPreferidas;

    public void adicionar(Audio audio){
        System.out.println("Ótima escolha, adicionando: " + audio.getNome() + " por " + audio.getAutor());
    }

}
