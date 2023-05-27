package br.com.alura.screenmatch.Model;

import br.com.alura.screenmatch.calcula.Classificavel;

public class Episodios implements Classificavel {

    private String nome;
    private int totalVisu;
    private Serie serie;

    public Episodios(String nome, int totalVisu, Serie serie) {
        this.nome = nome;
        this.totalVisu = totalVisu;
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalVisu >= 1000) {
            return 4;
        } else {
            return 2;
        }
    }
}

