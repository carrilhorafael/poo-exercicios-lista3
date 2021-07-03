package exercicio4;

public class Data {
    private int dia;
    private int mesInt;
    private String mesString;
    private int ano;
    private int format;

    Data(int dia, int mesInt, int ano){
        this.dia = dia;
        this.mesInt = mesInt;
        this.ano = ano;
        this.format = 1;
    }

    Data(int dia, String mesString, int ano){
        this.dia = dia;
        this.mesString = mesString;
        this.ano = ano;
        this.format = 2;
    }

    Data(int dia, int ano){
        this.dia = dia;
        this.ano = ano;
    }


    public String getFormatedData(){
        if (this.format == 1){
            return this.dia + "/" + this.mesInt + "/" + this.ano;
        }
        else if (this.format == 2){
            return this.mesString + " " + this.dia + ", " + this.ano;
        }
        else{
            return this.dia + " " + this.ano;
        }
    }


}
