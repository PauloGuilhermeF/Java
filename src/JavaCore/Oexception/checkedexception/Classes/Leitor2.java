package JavaCore.Oexception.checkedexception.Classes;

public class Leitor2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando o leitor 1");
    }
}
