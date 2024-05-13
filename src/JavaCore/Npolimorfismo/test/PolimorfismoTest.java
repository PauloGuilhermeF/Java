package JavaCore.Npolimorfismo.test;

import JavaCore.Npolimorfismo.classes.Funcionario;
import JavaCore.Npolimorfismo.classes.Gerente;
import JavaCore.Npolimorfismo.classes.RelatorioPagamento;
import JavaCore.Npolimorfismo.classes.Vendedor;
public class PolimorfismoTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Oswaldo", 5000, 2000);
        Vendedor v = new Vendedor("Yuri",2000,20000);
        RelatorioPagamento relatorio =  new RelatorioPagamento();
//        relatorio.relatorioPagamentoGerente(g);
//        System.out.println("---------------------------");
//        relatorio.relatorioPagamentoVendedor(v);
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("---------------------------");
        relatorio.relatorioPagamentoGenerico(v);

    }
}
