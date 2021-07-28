package io.github.jhoncosta08.clientes.exception;


public class UsuarioCadastradoException extends RuntimeException {

    public UsuarioCadastradoException(String login){
        super("Usuário " + login + " já cadastrado no sistema!");
    }
}
