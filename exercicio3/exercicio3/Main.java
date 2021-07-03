package exercicio3.exercicio3;

class Main {
    public static void main(String[] args) {
        Porta porta = new Porta();
        porta.abrirPorta();
        porta.fecharPorta();
        porta.setAltura(2.4);
        porta.setLargura(0.8);
        porta.setAltura(2.8);
        porta.setLargura(1.2);
        
        porta.setCor("Azul");
        porta.setCor("Amarelo");
        porta.setCor("Vermelho");
        porta.setCor("Verde");

        if (porta.estaAberta())
            System.out.println("A porta está aberta");
        else
            System.out.println("A porta está fechada");

    }
}
