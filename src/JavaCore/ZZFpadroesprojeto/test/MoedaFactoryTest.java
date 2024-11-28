package JavaCore.ZZFpadroesprojeto.test;

import JavaCore.ZZFpadroesprojeto.classes.Moeda;
import JavaCore.ZZFpadroesprojeto.classes.MoedaFactory;
import JavaCore.ZZFpadroesprojeto.classes.Pais;

public class MoedaFactoryTest {
    public static void main(String[] args) {
        Moeda moeda = MoedaFactory.criarMoeda(Pais.Alemanha);
        System.out.println(moeda.getSimbolo());
    }
}
