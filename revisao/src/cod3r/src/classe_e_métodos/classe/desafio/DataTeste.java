package classe_e_métodos.classe.desafio;

public class DataTeste {
    public static void main(String[] args) {

        Data data = new Data();
        Data data2 = new Data();

        data.dia = 7;
        data.mes = 11;
        data.ano = 2021;

        data2.dia = 31;
        data2.mes = 12;
        data2.ano = 2020;

        System.out.println(data.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());
        System.out.println();
        data2.imprimirDataFormatada();
        data.imprimirDataFormatada();
    }
}
