package principal;

//contrato Autenticavel
    //quem assina esse contrato, precisa implementar
        //metodo setSenha
        //metodo autentica
public abstract interface Autenticavel   {
    //n�o pode ter atributos


// todos os metodos de um INTERFACE s�o abstract

    public abstract void setSenha(int senha);
        //metodos n�o pode ter implementa��o
    public abstract boolean autentica(int senha);
}
