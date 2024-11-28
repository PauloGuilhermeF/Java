package JavaCore.ZZCjdbc.test;

import JavaCore.ZZCjdbc.classes.Comprador;
import JavaCore.ZZCjdbc.db.CompradorDAO;

import java.util.List;
import java.util.Scanner;

public class CompradorCRUD {
    private static Scanner teclado = new Scanner(System.in);

    public static void executar(int op) {
        switch (op) {
            case 1:
                inserir();
                break;
            case 2:
                atualizar();
                break;
            case 3:
                listar();
                break;
            case 4:
                System.out.println("Digite o nome");
                buscarPorNomes(teclado.nextLine());
                break;
            case 5:
                deletar();
                break;
        }
    }

    private static void inserir() {
        Comprador c = new Comprador();
        System.out.println("Nome: ");
        c.setNome(teclado.nextLine());
        System.out.println("Cpf: ");
        c.setCpf(teclado.nextLine());
        CompradorDAO.save(c);
    }

    private static void atualizar() {
        System.out.println("Selecione um dos carros abaixo");
        List<Comprador> compradorList = listar();
        Comprador c = compradorList.get(Integer.parseInt(teclado.nextLine()));
        System.out.println("Novo nome ou enter para manter o mesmo");
        String nome = teclado.nextLine();
        System.out.println("Nova cpf ou enter para manter o mesma");
        String cpf = teclado.nextLine();
        if (!nome.isEmpty()) {
            c.setNome(nome);
        }
        if (!cpf.isEmpty()) {
            c.setCpf(cpf);
        }
        CompradorDAO.update(c);

    }

    public static List<Comprador> listar() {
        List<Comprador> compradorList = CompradorDAO.selectAll();
        for (int i = 0; i < compradorList.size(); i++) {
            Comprador c = compradorList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + " " + c.getCpf());
        }
        return compradorList;
    }

    public static void buscarPorNomes(String nome) {
        List<Comprador> compradorList = CompradorDAO.searchByName(nome);
        for (int i = 0; i < compradorList.size(); i++) {
            Comprador c = compradorList.get(i);
            System.out.println("[" + i + "] " + c.getNome() + " " + c.getCpf());
        }
    }

    public static void deletar() {
        System.out.println("Selecione um dos compradores abixo para deletar");
        List<Comprador> compradorList = listar();
        int index = Integer.parseInt(teclado.nextLine());
        System.out.println("Tem certeza? S/N");
        String op = teclado.nextLine();
        if (op.startsWith("s")) {
            CompradorDAO.delete(compradorList.get(index));
        }

    }
}
