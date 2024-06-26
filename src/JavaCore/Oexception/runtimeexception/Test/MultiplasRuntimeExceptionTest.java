package JavaCore.Oexception.runtimeexception.Test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IllegalArgumentException | IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("dentro do ArrayIndexOutOfBoundsException");
        }
        System.out.println("final do programa");

        try {
            talvezLanceException();
        } catch (Exception e) {

        }
    }

    private static void talvezLanceException() throws SQLException, AWTException, IOException {

    }
}