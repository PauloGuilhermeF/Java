package JavaCore.ZZBclassesinternas.Test;

public class ClassesLocaisTest {
    private String nome = " William";

    public void fazAlgumaCoisa() {
        String sobrenome = "Suane";
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTest externa = new ClassesLocaisTest();
        externa.fazAlgumaCoisa();
    }
}