package exercicio3.exercicio6;

public class Baralho {
    private Carta[] cartas = new Carta[52];
    private int numCartas = 0;

    public void adicionarCarta (Carta carta){
        cartas[numCartas] = carta;
        numCartas++;
    }
    public void imprimirBaralho (){
        System.out.println("Esse baralho tem as seguintes cartas:");
        for (int i = 0; i < 52; i++){
            System.out.println(cartas[i].getValor() + " de " + cartas[i].getNaipe());
        }
    }
}
