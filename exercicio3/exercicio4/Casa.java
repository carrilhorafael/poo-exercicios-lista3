package exercicio3.exercicio4;

public class Casa {
    private String cor;
    private Porta[] portas = new Porta[100];
    private int numPortas = 0;

    
    public void adicionarPorta (Porta porta){
        portas[numPortas] = porta;
        numPortas++;
    }
    public int quantasPortasAbertas (){
        int portasAbertas = 0;
        for (int i = 0; i < numPortas; i++ )
            if (portas[i].estaAberta()) portasAbertas++;
        return portasAbertas;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor (String cor){
        this.cor = cor;
    }
}
