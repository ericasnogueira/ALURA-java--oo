package principal.teste;

import principal.ControleBonificacao;
import principal.EditorVideo;
import principal.Funcionario;
import principal.Gerente;

public class TesteReferencias {
    public static void main(String[] args) {

        // todo gerente é um funcionario , mas nem todo funcionario é um gerente
        Gerente g1 = new Gerente();// variavel do tipo funcionario// ao contrario não vai
        g1.setNome("Erica Silva");
        g1.setSalario(5000.0);


        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000.0);

        EditorVideo video = new EditorVideo();
        video.setSalario(2500.0);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(g1);
        controle.registra(funcionario);
        controle.registra(video);

        System.out.println(controle.getSoma());
    }
}
