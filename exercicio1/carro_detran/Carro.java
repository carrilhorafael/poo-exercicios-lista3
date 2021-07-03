package exercicio1.carro_detran;

class Defeito {
    String nomeDoDefeito;
    String correcaoNecessaria;
    float multa;
    Defeito(String nomeDoDefeito, String correcaoNecessaria, float valorDaMulta){}
}

class Motorista{
    private String nomeDoMotorista;
    private String cnhDoMotorista;
    Motorista(String nomeDoMotorista, String cnhDoMotorista){}
}

public class Carro {
    private String modelo;
    private String placa;
    private String ultimaVistoria;
    private Motorista motorista;
    private Defeito[] defeitos = new Defeito[100];

    Carro(String modelo, String placa, Motorista motorista){}
    
    public void iniciarVistoria (String hoje){}
    public void adicionarDefeito (Defeito defeito){}
    public float getMulta(){}
}
