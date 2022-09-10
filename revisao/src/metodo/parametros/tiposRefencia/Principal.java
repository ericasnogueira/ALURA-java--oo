package metodo.parametros.tiposRefencia;

public class Principal {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();


        estudante.nome = "Shoto";
        estudante. idade = 15;
        estudante.sexo = 'M';


        estudante2.nome = "sakura";
        estudante2. idade = 16;
        estudante2.sexo = 'F';

        System.out.println(estudante.imprimiEstudante());
        System.out.println("=======");
        System.out.println(estudante2.imprimiEstudante());

    }
}
