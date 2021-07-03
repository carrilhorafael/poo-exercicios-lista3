package exercicio3.exercicio4;

public class Porta {
    private boolean aberta;
    private String cor;

    public boolean estaAberta(){
        return aberta;
    }

    public void abrirPorta(){
        aberta = true;
    }
    public void fecharPorta(){
        aberta = false;
    }

    public String getCor() {
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
}
