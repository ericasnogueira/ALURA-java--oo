package principal;

//contrato Autenticavel
    //quem assina esse contrato, precisa implementar
        //metodo setSenha
        //metodo autentica
public abstract interface Autenticavel   {


// todos os metodos de um INTERFACE são abstract

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);
}
