package br.com.projeto.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4){
            System.out.println("bem avaliado");
        }else if (classificavel.getClassificacao() >= 2){
            System.out.println("media");
        }else {
            System.out.println("mal avaliado");
        }
    }
}
