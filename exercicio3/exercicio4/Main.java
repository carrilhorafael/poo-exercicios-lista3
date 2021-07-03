package exercicio3.exercicio4;
class Main{
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.setCor("Vermelho");
        casa.setCor("Verde");
        casa.setCor("Azul");

        Porta portaDaSala = new Porta();
        portaDaSala.setCor("Preto");
        Porta portaDaCozinha = new Porta();
        portaDaCozinha.setCor("Vermelho");
        Porta portaDoQuarto = new Porta();
        portaDoQuarto.setCor("Vermelho");
        
        portaDaSala.abrirPorta();
        portaDaCozinha.fecharPorta();
        portaDoQuarto.abrirPorta();

        System.out.println(casa.quantasPortasAbertas());

    }
}
