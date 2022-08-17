package principal.dominio;

//interface  =  um contrato para implementação
public interface DataLoader {

    //pode ter metodos
    void load(); // na interface todos os metodos são public e abstract

    // fazendo um metodo que não precisa fazer implementação na classe , a implementação fica aqui mesmo
    default void checkPermission(){
    System.out.println("Fazendo a checagem de permissões");
    }
}
