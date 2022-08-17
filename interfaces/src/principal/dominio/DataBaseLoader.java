package principal.dominio;

public class DataBaseLoader implements DataLoader, DataRemover{

    //como estou implementando da interface
    //é obrigatorio implementa o seu metodo
    @Override
    public void load() {
        System.out.println("Carregando dados do Banco de Dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo do Dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
}
