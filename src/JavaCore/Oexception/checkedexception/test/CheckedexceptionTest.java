package JavaCore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedexceptionTest {
    public static void main(String[] args) {
        abrirAquivo();
    }

    public static void criaraAquivo() throws IOException {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo criado" + file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static String abrirAquivo() {
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leittura do arquivo");
           // throw new Exception();
            System.out.println("Escrevendo no arquivo");
            return "Valor";
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        } finally {
            System.out.println("Fechar o arquivo");
        }
        return null;
    }
}
