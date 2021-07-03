package exercicio3.exercicio1;

public class Contato {
    private String nome;
    private String numero;

    Contato (String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public void imprimirContato(){
        System.out.print("Nome: " + nome);
        System.out.println(" / Numero: " + numero);
    }

    // getters
    public String getNome() {
        return nome;
    }
    public String getNumero() {
        return numero;
    }

    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }


}
