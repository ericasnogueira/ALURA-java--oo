package membros_De_Classe_VS_Instancia.test;

import membros_De_Classe_VS_Instancia.entities.AreaCirc;

import java.util.Locale;

public class AreaTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        AreaCirc area1 = new AreaCirc(10);


        AreaCirc area2 = new AreaCirc(5);

        //se quiser mudar o valor de um atributo que está static é para mudar pelo nome da classe não pela instância


        System.out.println(area1.area());

        System.out.println(area2.area());

        System.out.println(AreaCirc.PI);

        System.out.println("-------------------------");
        // metodo static sendo chamado pela classe
        System.out.println(AreaCirc.area(100));
    }
}
