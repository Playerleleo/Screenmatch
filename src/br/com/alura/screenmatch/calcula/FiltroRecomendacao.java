package br.com.alura.screenmatch.calcula;

public class FiltroRecomendacao {

    public void filtrar (Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os favoritos da galera");
        } else if (classificavel.getClassificacao() < 4){
            System.out.println("Adicione para ver mais tarde");
        }
    }
}
