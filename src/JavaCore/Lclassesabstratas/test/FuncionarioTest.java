package JavaCore.Lclassesabstratas.test;

import JavaCore.Lclassesabstratas.classes.Funcionario;
import JavaCore.Lclassesabstratas.classes.Gerente;
import JavaCore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente g = new Gerente("Anna", "11122-2", 2000);
        Vendedor v = new Vendedor("Camila", "22211-4",1500,5000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(g);
        System.out.println("--------------");
        System.out.println(v);
    }
}
