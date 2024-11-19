package JavaCore.Oexception.checkedexception.test;

import JavaCore.Oexception.customexception.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";
        if (!usuarioBancoDeDados.equals(usuarioDigitado) || ! senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else {
            System.out.println("Logado");
        }
    }
}
