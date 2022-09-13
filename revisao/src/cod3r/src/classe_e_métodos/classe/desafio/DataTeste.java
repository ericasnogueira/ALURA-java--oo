package classe_e_métodos.classe.desafio;

public class DataTeste {
    public static void main(String[] args) {

        Data data = new Data();
        Data data2 = new Data();

        data.dia = 10;
        data.mes = 07;
        data.ano = 1599;

        data2.dia = 15;
        data2.mes = 03;
        data2.ano = 1456;

        System.out.println(data.obterDataFormatada());
        System.out.println(data2.obterDataFormatada());
    }
}
