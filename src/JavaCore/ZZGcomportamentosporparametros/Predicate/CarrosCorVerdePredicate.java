package JavaCore.ZZGcomportamentosporparametros.Predicate;

import JavaCore.ZZGcomportamentosporparametros.Classes.Carro;
import JavaCore.ZZGcomportamentosporparametros.Interface.CarroPredicate;

public class CarrosCorVerdePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getCor().equals("verde");
    }
}
