package br.com.alura.screenmatch.Model;

import br.com.alura.screenmatch.calcula.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme(String nome, int anoDeLacamento, boolean incluidoNoPlano, int duracaoEmMinutos) {
        super(nome, anoDeLacamento, incluidoNoPlano, duracaoEmMinutos);
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
