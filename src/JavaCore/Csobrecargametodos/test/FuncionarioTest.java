package JavaCore.Csobrecargametodos.test;

import JavaCore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva", "111.222.333-44", 4500, "122212-9");
        Funcionario funcionario2 = new Funcionario();

        funcionario.imprime();
        funcionario2.imprime();


    }
}
