package exercicio3.exercicio5;

public class Televisao {
    private int canal;
    private int volume = 0;
    private boolean modoSilencioso = false;
    private boolean ligada = false;

    public void ligar(){
        ligada = true;
        System.out.println("Televisão ligada");
    }
    public void desligar(){
        ligada = false;
        System.out.println("Televisão desligada");
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("A televisão agora está com volume " + volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("A televisão agora está com volume " + volume);
    }
    public void mudarProximoCanal(){
        if(canal < 100){
            canal++;
            System.out.println("A televisão agora está no canal " + canal);
        }
    }
    public void mudarCanalAnterior(){
        if(canal > 0){
            canal--;
            System.out.println("A televisão agora está no canal " + canal);
        }
    }
    public void mudarCanalEspecifico(int novoCanal){
        if (novoCanal < 100 && novoCanal > 0){
            canal = novoCanal;
            System.out.println("A televisão agora está no canal " + canal);            
        }
    }
    public void silenciar(){
        modoSilencioso = true;
        System.out.println("Televisão em modo silencioso");
    }
    public void desmutar(){
        modoSilencioso = false;
        System.out.println("Televisão desmutada");
    }
    public void imprimirEstado(){
        System.out.println("------------------- SAÍDA -------------------");
        System.out.println("A televisão atualmente está com os seguintes estados:");
        if (ligada)
            System.out.println("Ligada");
        else
            System.out.println("Desligada");
        System.out.println("Volume: " + volume);
        System.out.println("Canal: " + canal);
        if (modoSilencioso) System.out.println("MUTE");
    }
}
