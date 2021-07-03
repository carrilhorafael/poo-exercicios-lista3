package exercicio4;

public class Main {
    public static void main(String[] args) {
        Data data1 = new Data(11, 02, 2000);
        Data data2 = new Data(23, 04, 1992);
        Data data3 = new Data(02, "Abril", 2001);
        Data data4 = new Data(03, "Julho", 2002);
        Data data5 = new Data(243, 2001);
        Data data6 = new Data(121, 2011);

        System.out.println(data1.getFormatedData());
        System.out.println(data2.getFormatedData());
        System.out.println(data3.getFormatedData());
        System.out.println(data4.getFormatedData());
        System.out.println(data5.getFormatedData());
        System.out.println(data6.getFormatedData());
    }
}
