package JavaCore.Isobrescrita.test;

import JavaCore.Isobrescrita.classes.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Joaquina na esquina");
        p.setIdade(300);
        System.out.println(p);
        Pessoa p2 = new Pessoa();
        p2.setNome("Joao na esquina");
        p2.setIdade(200);
        System.out.println(p2);
    }
}
