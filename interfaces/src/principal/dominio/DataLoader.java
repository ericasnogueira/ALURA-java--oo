package principal.dominio;

//interface  =  um contrato para implementa��o
public interface DataLoader {

    //pode ter metodos
    void load(); // na interface todos os metodos s�o public e abstract

    // fazendo um metodo que n�o precisa fazer implementa��o na classe , a implementa��o fica aqui mesmo
    default void checkPermission(){
    System.out.println("Fazendo a checagem de permiss�es");
    }
}
