package classe_e_métodos.valorVSreferencia;

public class Data {
    //atributos
    int dia;
    int  mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public  String obterDataFormatada (){
        return String.format("%d/%d/%d", dia,mes,ano);
    }

    // pode chamar metodo dentro de metodo
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
