package principal;

public class DataBaseLoader implements DataLoader{

    //como estou implementando da interface
    //� obrigatorio implementa o seu metodo
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados");
    }
}
