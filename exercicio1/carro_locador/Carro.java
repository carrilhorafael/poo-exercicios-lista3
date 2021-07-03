package exercicio1.carro_locador;

class Tempo {
    private float dia;
    private float mes;
    private float ano;
    private float hora;
    private float minutos;
    Tempo (float dia, float mes, float ano, float hora, float minutos){}
}

class Cliente {
    private String nomeDoCliente;
    private String rgDoCliente;
    Cliente(String nomeDoCliente, String rgDoCliente){}
}

public class Carro {
    private Tempo inicioAluguel;
    private Tempo finalAluguel;
    private Cliente cliente;
    private String modelo;
    private String placa;
    private String formaPagamento;
    private float precoPorHora;
    private float multaDeAtraso;

    Carro(String modelo, String placa){}

    public void iniciarAluguel(Cliente cliente, Tempo inicioAluguel, float diasDeAluguel){}
    public void finalizarAluguel(String formaPagamento){}
    public float precoAluguel(){
        return precoAluguel;
    }
    public void calcularMulta(float diasDeAtraso){}    
}
