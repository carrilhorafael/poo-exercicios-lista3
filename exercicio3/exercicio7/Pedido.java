package exercicio3.exercicio7;

public class Pedido {
    public enum MetodoPagamento {
        CARTAO, CHEQUE, DINHEIRO
    }

    private String cliente;
    private Item[] itens = new Item[100];
    private int numItens = 0;
    private MetodoPagamento pagamento;

    Pedido (String cliente){
        this.cliente = cliente;
    }

    public void adicionarItem (Produto produto, int quantidade){
        if (produto.getEstoque() >= quantidade){
            boolean novoItem = true;
            for (int i = 0; i < numItens; i++){
                if (itens[i].getProduto().equals(produto)){
                    novoItem = false;
                    itens[i].setQuantidade(itens[i].getQuantidade() + quantidade);
                }
            }
            if (novoItem){
                Item item = new Item(produto, quantidade);
                itens[numItens] = item;
                numItens++;
            }
            produto.setEstoque(produto.getEstoque() - quantidade);
        }
    }
    public void executarPagamento (MetodoPagamento pagamento){
        this.pagamento = pagamento; 
    }
    public float subTotal (){
        float subtotal = 0;
        for (int i = 0; i < numItens; i++){
            subtotal = subtotal + itens[i].getProduto().getPreco();
        }
        return subtotal;
    }

    public void imprimeCarrinho (){
        System.out.println("------------------------- CARRINHO -------------------------");
        System.out.println("Items: ");
        for (int i = 0; i < numItens; i++){
            System.out.println(itens[i].getProduto().getNome() + "| Quantidade: " + itens[i].getQuantidade() + "| Preço Individual: " + itens[i].getProduto().getPreco());
        }
        System.out.println("Preço total: " + subTotal());
        System.out.println("Metodo de pagamento: " + pagamento);
    }

    public String getCliente() {
        return cliente;
    }
}
