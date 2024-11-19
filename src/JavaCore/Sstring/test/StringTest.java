package JavaCore.Sstring.test;

public class StringTest {
    public static void main(String[] args) {
        String nome = "William";
        nome = nome.concat(" Suane");
        String nome2 = "Wolliam";
        String nome3 = new String("Catarina");

        String teste = "Goku";
        String teste2 = "0123456789";
        System.out.println(teste.charAt(3));
        System.out.println(teste.equals(teste2));
        System.out.println(teste.length());
        System.out.println(teste2.replace('a','o'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste2.toUpperCase());
        System.out.println(teste2.substring(0,5));
        System.out.println(teste2.trim());

    }
}
