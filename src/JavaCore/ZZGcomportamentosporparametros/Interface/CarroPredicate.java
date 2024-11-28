package JavaCore.ZZGcomportamentosporparametros.Interface;

import JavaCore.ZZGcomportamentosporparametros.Classes.Carro;

@FunctionalInterface
public interface CarroPredicate {
    boolean test(Carro carro);
}