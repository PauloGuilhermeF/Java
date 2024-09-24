package JavaCore.ZZHlambdas.Interfaces;

import JavaCore.ZZHlambdas.Classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
    // (parametro) -> <expressao>
    // (Carro carro) -> carro.getCor().equals("verde");
}
