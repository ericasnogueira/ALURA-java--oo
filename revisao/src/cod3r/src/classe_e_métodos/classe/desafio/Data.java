package classe_e_m�todos.classe.desafio;

public class Data {
    //atributos
    int dia;
    int  mes;
    int ano;

    public  String obterDataFormatada (){
        return String.format("%d/%d/%d", dia,mes,ano);
    }
}
