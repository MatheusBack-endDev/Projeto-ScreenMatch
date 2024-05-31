package br.com.projeto.screenmatch.modelos;

import br.com.projeto.screenmatch.calculo.Classificavel;

import java.util.Scanner;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDelançamento) {
        super(nome, anoDelançamento);
    }


    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }


    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDelancamento() + ")" ;
    }


}
