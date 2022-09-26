package classe_e_m�todos.valorVSreferencia;



public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; // atribui��o por valor (Tipo primitivo)

        a++;
        b--;
        System.out.println(a + "  "+ b);

        Data d1 = new Data(1,6,2022);
        Data d2 = d1; // atribui��o por refer�ncia (objeto)

        /*
        as duas aponta para a mesma refer�ncia, mesmo mudando s� um ir� impactar a outra.
         */

        d1.dia = 31;
        d2.mes = 12;

        d1.ano =2025;
        d2.ano = 2030;

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());

        voltarDataParaValorPadrao(d1);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());


        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);

    }
    //m�todo est�tico s� consegue acessar outro m�todo est�tico
    //metodo est�tico
    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }

    static void alterarPrimitivo(int a ){
        a++;
    }
}
