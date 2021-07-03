package exercicio3.exercicio8;

public class Bateria {
    private int capacidadeDeCarga = 100;
    private int nivelDeCargaAtual = 100;

    public void setCapacidadeDeCarga(int capacidadeDeCarga) {
        this.capacidadeDeCarga = capacidadeDeCarga;
    }
    public void setNivelDeCargaAtual(int nivelDeCargaAtual) {
        this.nivelDeCargaAtual = nivelDeCargaAtual;
    }
    public int getNivelDeCargaAtual() {
        return nivelDeCargaAtual;
    }
    public int getCapacidadeDeCarga() {
        return capacidadeDeCarga;
    }

}
