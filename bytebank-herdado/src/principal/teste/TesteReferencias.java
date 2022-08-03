package principal.teste;

import principal.ControleBonificacao;
import principal.EditorVideo;
import principal.Funcionario;
import principal.Gerente;

public class TesteReferencias {
    public static void main(String[] args) {

        // todo gerente � um funcionario , mas nem todo funcionario � um gerente
        Gerente g1 = new Gerente();// variavel do tipo funcionario// ao contrario n�o vai
        g1.setNome("Erica Silva");
        g1.setSalario(5000.0);


        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000.0);

        EditorVideo video = new EditorVideo();
        video.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);
        System.out.println("Mostrando a bonifica��o do gerente ");
        System.out.println("Sua bonifica��o foi adicionada no metodo registra e mostrado pelo getSoma");
        System.out.println(controle.getSoma());
        System.out.println("//////////////////////////////////////////////////");

        controle.registra(funcionario);
        System.out.println("Mostrando a soma da bonifica��o do gerente e do funcionario juntos ");
        System.out.println("Sua bonifica��o foi adicionada no metodo registra e mostrado pelo getSoma");
        System.out.println(controle.getSoma());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        controle.registra(video);
        System.out.println("Mostrando a soma da bonifica��o do Gerente  + funcionario + editor de video ");
        System.out.println("Sua bonifica��o foi adicionada no metodo registra e mostrado pelo getSoma");
        System.out.println(controle.getSoma());
        System.out.println("//////////////////////////////////////////////////");



        System.out.println("============Pegando diretamento do Metodo de cada classe=================");
        System.out.println("Bonifica��o do Gerente : " + g1.getBonificacao());
        System.out.println("Bonifica��o do Funcionario : " + funcionario.getBonificacao());
        System.out.println("Bonifica��o do Editor de Video : " + video.getBonificacao());
        System.out.println("=========================================================================");

        System.out.println("Pegando a soma de todas as bonifica��es na classe ControleBonificacao pelo get");
        System.out.println("Mostrando todas as bonifica��es : ");
        System.out.println(controle.getSoma());
    }
}
