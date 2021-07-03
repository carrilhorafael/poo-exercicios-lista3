package exercicio3.exercicio3;

public class Porta {
    private boolean aberta;
    private String cor;
    private double altura;
    private double largura;


    public boolean estaAberta(){
        return aberta;
    }
    public void abrirPorta(){
        aberta = true;
    }
    public void fecharPorta(){
        aberta = false;
    }
    
    // getters
    public double getAltura() {
        return altura;
    }
    public double getLargura() {
        return largura;
    }
    public String getCor() {
        return cor;
    }

    // setters
    public void setAltura (double altura){
        this.altura = altura;
    }
    public void setLargura (double largura){
        this.largura = largura;
    }
    public void setCor(String cor){
        this.cor = cor;
    }
}
