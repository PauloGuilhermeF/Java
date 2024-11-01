package JavaCore.Eblocodeinicializacao.test;

import JavaCore.Eblocodeinicializacao.classes.Cliente;


public class ClienteTest {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for(int parcela : c.getParcelas()){
            System.out.print(parcela + " ");
        }
    }
}
