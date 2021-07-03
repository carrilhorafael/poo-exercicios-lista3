package exercicio2;

public class Professor {
    private String nome;
    private String matricula;
    private String email;
    private Disciplina[] podeLecionar = new Disciplina[100];

    //constructor
    Professor(String nome, String matricula, String email){
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }

    // functions
    public void adicionarDisciplina (Disciplina disciplina){
        int i = 0;
        while(podeLecionar[i] != null) i++;
        podeLecionar[i] = disciplina;
    }

    // getters
    public String getEmail() {
        return email;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }

    //setters
    public void setEmail(String email) {
        this.email = email;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
