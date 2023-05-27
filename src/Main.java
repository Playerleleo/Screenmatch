import br.com.alura.screenmatch.Model.Episodios;
import br.com.alura.screenmatch.Model.Serie;
import br.com.alura.screenmatch.Model.Titulo;
import br.com.alura.screenmatch.calcula.Calcula;
import br.com.alura.screenmatch.Model.Filme;
import br.com.alura.screenmatch.calcula.FiltroRecomendacao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var filme01 = new Filme("Harry potter",2004,true,90);


        Filme filme02 = new Filme("Avatar",2023,true,200);
        Filme filme03 = new Filme("piratas do caribe",2010,true,300);


        Serie serie01 = new Serie("The last of us", 2023, true, 45);
        Serie serie02 = new Serie("Flash", 2012, true, 45);

        Episodios episodio01 = new Episodios("Piloto", 100, serie01);
        Episodios episodio02 = new Episodios("Piloto",1000, serie01);


        FiltroRecomendacao filtrar = new FiltroRecomendacao ();

        filtrar.filtrar(episodio01);
        filtrar.filtrar(episodio02);

        Calcula calcula = new Calcula();

        filme01.avalia(10.0);
        filme01.avalia(10.0);
        filme01.avalia(8.0);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filme01);
        lista.add(filme02);
        lista.add(filme03);
        lista.add(serie01);
        lista.add(serie02);


    System.out.println("****************************************************************");
        System.out.println("Lista: ");

        for (Titulo item : lista ) {
            if(item instanceof Filme filme && filme.getClassificacao() > 2){

                System.out.println("O nome do filme é: " + item.getNome() + " e sua classificacao é: " + ((Filme) item).getClassificacao());
            }

        }
        System.out.println("****************************************************************");


    }
}