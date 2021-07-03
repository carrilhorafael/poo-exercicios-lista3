package exercicio3.exercicio1;

public class Agenda {
    private int numContatos = 0;
    private Contato dono;
    private Contato[] contatos = new Contato[100];

    Agenda(Contato dono){
        this.dono = dono;
    }

    public void adicionarContato (Contato contato){
        boolean novoContato = true;
        for (int i = 0; i < numContatos; i++){
            if (contato.equals(contatos[i])){
                novoContato = false;
            }
        }
        if (novoContato){
            contatos[numContatos] = contato;
            numContatos++;
            System.out.println("Contato " + contato.getNome() + " adicionado");
        }else{
            System.out.println("O contato " + contato.getNome() + " já existe");
        }
    }

    public void imprimirAgenda (){
        System.out.println("O usuário " + dono.getNome() + " tem os seguintes contatos adicionados: ");
        for(int i = 0; i < numContatos; i++){
            contatos[i].imprimirContato();
        }
    }

    // getters
    public Contato getDono() {
        return dono;
    }
    public Contato[] getContatos() {
        return contatos;
    }
}
