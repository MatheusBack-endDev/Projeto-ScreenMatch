package br.com.projeto.screenmatch.principal;

import br.com.projeto.screenmatch.calculo.CalculadorDeTempo;
import br.com.projeto.screenmatch.calculo.FiltroRecomendacao;
import br.com.projeto.screenmatch.modelos.Episodio;
import br.com.projeto.screenmatch.modelos.Filme;
import br.com.projeto.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        meuFilme.setAnoDelancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);


        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(8);

        System.out.println(meuFilme.getsomaAvalicoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());


        Serie lost = new Serie("lost", 2000, 10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodios(50);
        lost.exibeFichaTecnica();
        System.out.println(lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);

        outroFilme.setAnoDelancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadorDeTempo calculadora = new CalculadorDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio ep = new Episodio();
        ep.setNumero(1);
        ep.setTotalVisualizacoes(300);
        ep.setSerie(lost);
        filtro.filtra(ep);


        Filme filmedopaulo = new Filme("Dogville", 2003);
        filmedopaulo.avalia(10);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmedopaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("Primeiro Filme " + listaDeFilmes.get(1).toString());


    }
}
