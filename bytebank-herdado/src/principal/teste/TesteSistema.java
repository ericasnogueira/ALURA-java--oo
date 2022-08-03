package principal.teste;

import principal.*;

import java.lang.ref.Cleaner;

public class TesteSistema {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        Cliente cliente = new Cliente();
        cliente.setSenha(2222);


        Administrador admin = new Administrador();
        admin.setSenha(5412);

        SistemaInterno sistemaInterno = new SistemaInterno();
        sistemaInterno.autentica(g);

        System.out.println("=============");
        sistemaInterno.autentica(admin);

        System.out.println("=========");
        sistemaInterno.autentica(cliente);


        
        System.out.println("=============================================");
        Autenticavel r = new Gerente();
        Autenticavel aaa = new Cliente();
        Autenticavel asd = new Administrador();
        //gerente
        r.setSenha(2222);
        aaa.setSenha(2222);
        asd.setSenha(2222);
        System.out.println("!!!!!!!!!!!!!!!!!");
        sistemaInterno.autentica(r);
        System.out.println("@@@@@@@@@@@@@@@");
        sistemaInterno.autentica(aaa);
        System.out.println("$$$$$$$$$$$$$$$$$$$");
        sistemaInterno.autentica(asd);



    }
}
