package br.com.projeto.screenmatch.modelos;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDelancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDelançamento) {
        this.nome = nome;
        this.anoDelancamento = anoDelançamento;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public double getsomaAvalicoes() {
        return somaAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setAnoDelancamento(int anoDelancamento) {
        this.anoDelancamento = anoDelancamento;
    }

    public int getAnoDelancamento() {
        return anoDelancamento;
    }

    public void exibeFichaTecnica() {
        System.out.println("nome do filme: " + nome);
        System.out.println("ano de lançamento: " + anoDelancamento);
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        double media;
        return media = somaAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo o) {
        return this.getNome().compareTo(o.getNome());
    }

    //Ordem decrecente

//    @Override
//    public int compareTo(Titulo o) {
//        if (this.getAnoDelançamento() < o.getAnoDelançamento()) {
//            return 1;
//        } else if (this.getAnoDelançamento() > o.getAnoDelançamento()) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}
