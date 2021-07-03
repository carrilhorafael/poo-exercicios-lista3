package exercicio3.exercicio7;

public class Produto {
    private String nome;
    private float preco;
    private int estoque;

    Produto (String nome, float preco, int estoque){
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }
    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
