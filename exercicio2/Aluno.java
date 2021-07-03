package exercicio2;

public class Aluno {
    private String matricula;
    private String nome;
    private Inscricao[] inscricoes = new Inscricao[100];

    Aluno (String matricula, String nome){}
    
    // CALCULO DO CR DE UM ALUNO
    // Busca as notas de todas as inscrições finalizadas e calcula a media geral
    public float cr(){}

    // EXIBIÇÃO DO HISTORICO DO ALUNO
    // Retorna a lista de matérias finalizadas do aluno
    public Inscricao[] getHistorico(){}
}
