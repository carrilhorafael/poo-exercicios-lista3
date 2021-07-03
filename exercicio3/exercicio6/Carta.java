package exercicio3.exercicio6;

public class Carta {
    private String naipe;
    private char valor;

    Carta(String naipe, char valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }
    public char getValor() {
        return valor;
    }

    public void setNaipe(String naipe) {
        this.naipe = naipe;
    }
    public void setValor(char valor) {
        this.valor = valor;
    }
}
