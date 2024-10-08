package JavaCore.ZZEconcorrencia.Test;

import java.util.concurrent.*;

public class CallableTest implements Callable<String> {

    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1, 11);
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + "Executando...");

        }
        return "Trabalho Finalizado o numero aleatorio eh: " + count;
    }

    public static void main(String[] args) {
        CallableTest ct = new CallableTest();
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> submit = executorService.submit(ct);
        Future<String> resutFuture = executorService.submit(ct);
        try {
            String s = resutFuture.get();
            System.out.println(s);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        executorService.shutdown();

    }
}
