package exercicio1.carro_oficina;

class Defeito {
    String nomeDoDefeito;
    String correcaoNecessaria;
    float valorDoConserto;
    Defeito(String nomeDoDefeito, String correcaoNecessaria, float valorDoConserto){}
}

class Cliente {
    private String nomeDoCliente;
    private String rgDoCliente;
    Cliente(String nomeDoCliente, String rgDoCliente){}
}

public class Carro {
    private String modelo;
    private String placa;
    private Cliente cliente;
    private Defeito[] defeitos;
    
    Carro(String modelo, String placa, Cliente cliente){}
    public void diagnosticarDefeito (Defeito defeito){}
    public void consertarDefeito(){}
    public float getTotal(){}
}
