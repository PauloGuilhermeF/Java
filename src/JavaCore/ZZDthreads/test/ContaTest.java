package JavaCore.ZZDthreads.test;

import JavaCore.ZZDthreads.Classes.Conta;

public class ContaTest implements Runnable {
    private final Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTest contaTest = new ContaTest();
        Thread William = new Thread(contaTest, "Willian");
        Thread anna = new Thread(contaTest, "Anna");
        William.start();
        anna.start();
    }
    public static void imprime(){
        synchronized (ContaTest.class){
            System.out.println("asasasas");
            new StringBuffer();
        }

    }

    private void saque(int valor) {
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + " esta indo sacar");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                conta.saque(valor);
                System.out.println(Thread.currentThread().getName() + " completou o saque: " + conta.getSaldo());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if (conta.getSaldo() < 0) {
                System.out.println("Oh meu deus!");
            }
        }

    }
}