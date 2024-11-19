package JavaCore.Oexception.checkedexception.test;

import JavaCore.Oexception.checkedexception.Classes.Funcioario;
import JavaCore.Oexception.checkedexception.Classes.Pessoa;
import JavaCore.Oexception.customexception.LoginInvalidoException;

import java.io.FileNotFoundException;

public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Funcioario f = new Funcioario();
        Pessoa p = new Pessoa();

        try {
            p.salvar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
