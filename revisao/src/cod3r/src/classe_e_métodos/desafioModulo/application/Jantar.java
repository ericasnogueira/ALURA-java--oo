package classe_e_m�todos.desafioModulo.application;

import classe_e_m�todos.desafioModulo.entities.Comida;
import classe_e_m�todos.desafioModulo.entities.Pessoa;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida("arroz", 0.180);
        Comida c2 = new Comida("feij�o", 0.300);

        Pessoa p = new Pessoa("Jo�o", 99.8);

        System.out.println(p.apresentar());

        p.comer(c1);
        System.out.println(p.apresentar());

        p.comer(c2);
        System.out.println(p.apresentar());

    }
}
