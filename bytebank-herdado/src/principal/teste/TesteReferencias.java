package principal.teste;

import principal.*;

public class TesteReferencias {
    public static void main(String[] args) {

        // todo gerente � um funcionario , mas nem todo funcionario � um gerente
        Gerente g1 = new Gerente();// variavel do tipo funcionario// ao contrario n�o vai
        g1.setNome("Erica Silva");
        g1.setSalario(5000.0);




        EditorVideo video = new EditorVideo();
        video.setSalario(2500.0);

        Designer designer = new Designer();
        designer.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);
        System.out.println("Mostrando a bonifica��o do gerente ");
        System.out.println("Sua bonifica��o foi adicionada no metodo registra e mostrado pelo getSoma");
        System.out.println(controle.getSoma());
        System.out.println("//////////////////////////////////////////////////");



        System.out.println();

        controle.registra(video);
        System.out.println("Mostrando a soma da bonifica��o do Gerente  +  editor de video ");
        System.out.println("Sua bonifica��o foi adicionada no metodo registra e mostrado pelo getSoma");
        System.out.println(controle.getSoma());
        System.out.println("//////////////////////////////////////////////////");

        System.out.println();

        controle.registra(designer);
        System.out.println("Mostrando a  bonifica��o do  designer");
        System.out.println("bonifica��o do designer n�o vai ser adicionado no ControleB.. pq no metodo est� retorno" +
                " normal, n�o esta com super.getBonificacao");
        System.out.println(designer.getBonificacao());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println();

        System.out.println("============Pegando diretamento do Metodo de cada classe=================");
        System.out.println("Bonifica��o do Gerente : " + g1.getBonificacao());
        System.out.println("Bonifica��o do Editor de Video : " + video.getBonificacao());
        System.out.println("Bonifica��o do Designer : " + designer.getBonificacao());
        System.out.println("=========================================================================");

        System.out.println();

        System.out.println("Pegando a soma de todas as bonifica��es na classe ControleBonificacao pelo get");
        System.out.println("Mostrando todas as bonifica��es : ");
        System.out.println(controle.getSoma());
    }
}
