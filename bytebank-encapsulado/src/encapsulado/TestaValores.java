package encapsulado;
public class TestaValores {
    public static void main(String[] args) {
        // por conta do construtor com os parametros
        //tem que botar tambem os paremetros no new conta(parametros)
        Conta conta = new Conta(1337,24226);
        Conta conta2 = new Conta(1355,15977);
        Conta conta3 = new Conta(19787,78945);
        Conta conta4 = new Conta(1556,16584);

        //mostrando só o total pelo get sem o construtor
        //Conta(classe).getTotal
        System.out.println(Conta.getTotal());



    }
}
