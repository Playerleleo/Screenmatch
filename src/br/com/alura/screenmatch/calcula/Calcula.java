package br.com.alura.screenmatch.calcula;

import br.com.alura.screenmatch.Model.Titulo;

public class Calcula {
    private int totalMinutos = 0;


    public int getTotalMinutos() {
        return totalMinutos;
    }

    public int calculaTempo(Titulo... titulo) {
        for (Titulo test : titulo) {
            totalMinutos += test.getDuracaoEmMinutos();
        }
        return totalMinutos;
    }


    public int calculaTempo2(Titulo... titulo) {
        for (Titulo test : titulo) {
            totalMinutos += test.getDuracaoEmMinutos();
        }
        return totalMinutos;
    }
}
