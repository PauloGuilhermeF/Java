package JavaCore.ZZFpadroesprojeto.classes;

public interface Moeda {
    String getSimbolo();
}

class euroAlemao implements Moeda {

    @Override
    public String getSimbolo() {
        return "EURO";
    }
}
class Real implements Moeda {

    @Override
    public String getSimbolo() {
        return "R$";
    }

}
class USDollar implements Moeda {

    @Override
    public String getSimbolo() {
        return "USD";
    }
}
