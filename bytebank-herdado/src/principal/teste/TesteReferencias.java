package principal.teste;

import principal.*;

public class TesteReferencias {
    public static void main(String[] args) {

        // todo gerente é um funcionario , mas nem todo funcionario é um gerente
        Gerente g1 = new Gerente();// variavel do tipo funcionario// ao contrario não vai
        g1.setNome("Erica Silva");
        g1.setSalario(5000.0);




        EditorVideo video = new EditorVideo();
        video.setSalario(2500.0);

        Designer designer = new Designer();
        designer.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);
        System.out.println("Mostrando a bonificação do gerente ");
        System.out.println("Sua bonificação foi adicionada no metodo registra e mostrado pelo getSoma");
        System.out.println(controle.getSoma());
        System.out.println("//////////////////////////////////////////////////");



        System.out.println();

        controle.registra(video);
        System.out.println("Mostrando a soma da bonificação do Gerente  +  editor de video ");
        System.out.println("Sua bonificação foi adicionada no metodo registra e mostrado pelo getSoma");
        System.out.println(controle.getSoma());
        System.out.println("//////////////////////////////////////////////////");

        System.out.println();

        controle.registra(designer);
        System.out.println("Mostrando a  bonificação do  designer");
        System.out.println("bonificação do designer não vai ser adicionado no ControleB.. pq no metodo está retorno" +
                " normal, não esta com super.getBonificacao");
        System.out.println(designer.getBonificacao());
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println();

        System.out.println("============Pegando diretamento do Metodo de cada classe=================");
        System.out.println("Bonificação do Gerente : " + g1.getBonificacao());
        System.out.println("Bonificação do Editor de Video : " + video.getBonificacao());
        System.out.println("Bonificação do Designer : " + designer.getBonificacao());
        System.out.println("=========================================================================");

        System.out.println();

        System.out.println("Pegando a soma de todas as bonificações na classe ControleBonificacao pelo get");
        System.out.println("Mostrando todas as bonificações : ");
        System.out.println(controle.getSoma());
    }
}
