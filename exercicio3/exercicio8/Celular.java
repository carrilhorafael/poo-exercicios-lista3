package exercicio3.exercicio8;

public class Celular {
    private Bateria bateria;

    Celular (Bateria bateria){
        this.bateria = bateria;
    }

    public void enviarMensagem(String mensagem){
        System.out.println("------------ Nova mensagem ------------");
        System.out.println(mensagem);
        System.out.println("---------------------------------------");
        bateria.setNivelDeCargaAtual(bateria.getNivelDeCargaAtual() - 1);
        imprimirNivelDaBateria();
    }
    public void efetuarLigacao(int duracao){
        int custo = duracao/5;
        System.out.println("------------ Finalizando ligação de "+ duracao +" segundos ------------");
        bateria.setNivelDeCargaAtual(bateria.getNivelDeCargaAtual() - custo);
        imprimirNivelDaBateria();

    }
    public void imprimirNivelDaBateria(){
        System.out.println("Nivel atual da bateria: "+ bateria.getNivelDeCargaAtual());
    }
}
