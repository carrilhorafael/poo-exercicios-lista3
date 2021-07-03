package exercicio2;

public class Disciplina {
    private String nome;
    private String ementa;
    private float cargaHoraria;
    private Disciplina[] preRequisitos = new Disciplina[100];
    
    // constructor
    Disciplina(String nome, float cargaHoraria, String ementa){
        this.nome = nome;
        this.ementa = ementa;
        this.cargaHoraria = cargaHoraria;
    }

    // functions
    public void adicionarPreRequisitos (Disciplina disciplina){
        int i = 0;
        while(preRequisitos[i] != null) i++;
        preRequisitos[i] = disciplina;
    }
    
    // getters
    public String getNome() {
        return nome;
    }
    public String getEmenta() {
        return ementa;
    }
    public float getCargaHoraria() {
        return cargaHoraria;
    }
    
    // setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
