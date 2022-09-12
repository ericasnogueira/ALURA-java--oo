package classe_e_métodos.classe.desafio;

public class DataTeste {
    public static void main(String[] args) {

        Data data = new Data();
        Data data2 = new Data();

        data.dia = 10;
        data.mes = "Abril";
        data.ano = 1599;

        data2.dia = 15;
        data2.mes = "Junho";
        data2.ano = 1456;

        System.out.println(data.dia + "/" + data.mes+ "/" + data.ano);
        System.out.println(data2.dia + "/" + data2.mes+ "/" + data2.ano);


    }
}
