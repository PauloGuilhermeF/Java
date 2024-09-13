package JavaCore.ZZDthreads.test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class ListaNomes {
    private List<String> nomes = Collections.synchronizedList(new LinkedList<>());

    public void add(String nome) {
        nomes.add(nome);
    }

    public void removerPrimeiro() {
        if (nomes.size() > 0) {
            System.out.println(nomes.remove(0));
        }
    }
}

public class ThreadSafeTest {
    public static void main(String[] args) {

        ListaNomes nomes = new ListaNomes();
        nomes.add("William suane");
        class RemovedorDeNomes extends Thread {
            public void run() {
                nomes.removerPrimeiro();
            }
        }
        new RemovedorDeNomes().start();
        new RemovedorDeNomes().start();
    }
}
