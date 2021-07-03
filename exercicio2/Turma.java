package exercicio2;

public class Turma {
    private Disciplina disciplina;
    private Professor professor;
    private String calendario;
    
    // constructor
    Turma (Disciplina disciplina, Professor professor, String calendario){
        this.disciplina = disciplina;
        this.professor = professor;
        this.calendario = calendario;
    }

    // getters
    public String getCalendario() {
        return calendario;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public Professor getProfessor() {
        return professor;
    }

    // setters
    public void setCalendario(String calendario) {
        this.calendario = calendario;
    }
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
