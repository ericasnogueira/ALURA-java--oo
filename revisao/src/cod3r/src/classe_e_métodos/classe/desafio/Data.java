package classe_e_métodos.classe.desafio;

public class Data {
    //atributos
    int dia;
    int  mes;
    int ano;

    public  String obterDataFormatada (){
        String formato = "%d/%d/%d"; // variavel local
        return String.format(formato, dia,mes,ano);
    }

    // pode chamar metodo dentro de metodo
    void imprimirDataFormatada(){
        System.out.println(obterDataFormatada());
    }
}
