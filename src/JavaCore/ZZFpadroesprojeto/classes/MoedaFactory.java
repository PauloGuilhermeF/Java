package JavaCore.ZZFpadroesprojeto.classes;

public class MoedaFactory {
    public static Moeda criarMoeda(Pais pais) {
        if (pais.equals(Pais.Brasil)) {
            return new Real();
        } else if (pais.equals(pais.EUA)) {
            return new USDollar();
        } else if (pais.equals(pais.Alemanha)){
            return new euroAlemao();
        } throw new IllegalArgumentException("Nao existe esse pais");

    }
}
