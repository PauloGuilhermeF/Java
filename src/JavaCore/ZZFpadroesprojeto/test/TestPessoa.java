package JavaCore.ZZFpadroesprojeto.test;

import JavaCore.ZZFpadroesprojeto.classes.Pessoa;

public class TestPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("William")
                .nomeDoMeio("Suane")
                .ultimoNome("Queiroz")
                .nomeDoPai("William")
                .apelido("JirayaBolado")
                .build();
        System.out.println(p);
    }
}

