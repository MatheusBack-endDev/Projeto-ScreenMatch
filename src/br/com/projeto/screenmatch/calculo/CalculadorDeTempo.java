package br.com.projeto.screenmatch.calculo;

import br.com.projeto.screenmatch.modelos.Titulo;

public class CalculadorDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {

        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){
        System.out.println("tempo foi de " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
