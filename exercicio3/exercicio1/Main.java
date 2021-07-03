package exercicio3.exercicio1;

class Main {
    public static void main (String[] args) {
        // Criar contato Rafael (dono da agenda)
        Contato rafael = new Contato("Rafael", "21911111111");
        // Criar contato Debora (entrará na agenda)
        Contato debora = new Contato("Débora", "21922222222");
        // Criar contato Ricardo (entrará na agenda)
        Contato ricardo = new Contato("Ricardo", "21933333333");
        
        // Criar agenda para o Rafael
        Agenda agendaRafael = new Agenda(rafael);
        // Adiciona Debora
        agendaRafael.adicionarContato(debora);
        // Adiciona Ricardo
        agendaRafael.adicionarContato(ricardo);
        
        agendaRafael.imprimirAgenda();
    } 
}