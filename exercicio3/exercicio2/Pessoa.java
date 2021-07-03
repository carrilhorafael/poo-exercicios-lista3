package exercicio3.exercicio2;

public class Pessoa {
    private int idade;
    private String nome;

    Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void fazerAniversario(){
        idade++;
    }
    public void falarIdade(){
        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " anos");
    }
}
