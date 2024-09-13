package JavaCore.ZZGcomportamentosporparametros.Predicate;

import JavaCore.ZZGcomportamentosporparametros.Classes.Carro;
import JavaCore.ZZGcomportamentosporparametros.Interface.CarroPredicate;

import java.util.Calendar;

public class CarrosDezAnosRecentePredicate implements CarroPredicate {
    @Override
    public boolean test(Carro carro) {
        return carro.getAno() > (Calendar.getInstance().get(Calendar.YEAR) - 10);
    }
}