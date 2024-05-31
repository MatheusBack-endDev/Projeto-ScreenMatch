package br.com.projeto.screenmatch.principal;

import br.com.projeto.screenmatch.modelos.Filme;
import br.com.projeto.screenmatch.modelos.Serie;
import br.com.projeto.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("dogville", 1970);
        meuFilme.avalia(3);
        Filme outroFilme = new Filme("avatar", 2023);
        outroFilme.avalia(6);
        Filme filmedopaulo = new Filme("filme",2002);
        filmedopaulo.avalia(10);
        Serie lost = new Serie("Lost", 2001, 10);
        lost.avalia(7);

        List<Titulo> listaNovoModelo = Arrays.asList(
                new Filme( "filme 2",1999),
                new Serie("SWAT", 2002, 10)
        );

        
        List<Titulo> listas = new LinkedList<>();
        listas.add(filmedopaulo);
        listas.add(meuFilme);
        listas.add(outroFilme);
        listas.add(lost);

        Collections.sort(listas);

        // a linha de codigo 35 faz a mesma coisa que a linha 36 e 37, imprime o toString
        // listas.forEach(System.out::println);
        for (Titulo titulo : listas) {
            System.out.println(titulo.toString());

            // O "Filme filme = (Filme) titulo" N PRECISA USAR ASSIM
            // pode declarar nas condicao do if
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2){
                // se for usar esse metodo
                // para pegar o getclassificacao do filme e nececario fazer um casting
                // Filme filme = (Filme) titulo;
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<Integer> numeroOrdenado = new ArrayList<>();

        numeroOrdenado.add(1);
        numeroOrdenado.add(10);
        numeroOrdenado.add(2);
        System.out.println(numeroOrdenado);

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Matheus");
        buscaPorArtista.add("Ana");
        buscaPorArtista.add("Diogenes");
        buscaPorArtista.add("Isadora");

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        // Ordena em ordem alfabetica ou numerica
        System.out.println("Ordena em ordem alfabetica ou numerica");
        Collections.sort(numeroOrdenado);
        System.out.println(numeroOrdenado);

        // Ordem alfabetica
        System.out.println("Ordem alfabetica");
        Collections.sort(listas);
        System.out.println(listas);

        // Ordem por data/ano de lançamento crecente
        System.out.println("Ordem por data/ano de lançamento crecente");
        listas.sort(Comparator.comparing(Titulo::getAnoDelancamento));
        System.out.println(listas);
    }
}
