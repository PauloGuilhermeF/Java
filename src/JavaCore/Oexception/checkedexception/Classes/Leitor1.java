package JavaCore.Oexception.checkedexception.Classes;

public class Leitor1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Fechando o leitor 2");
    }
}
