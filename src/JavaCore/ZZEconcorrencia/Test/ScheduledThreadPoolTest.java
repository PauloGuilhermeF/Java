package JavaCore.ZZEconcorrencia.Test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.concurrent.*;

public class ScheduledThreadPoolTest {
    private static final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    private static void beep() {
        final Runnable beeper = new Runnable() {
            @Override
            public void run() {
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(new Date()) + " beep");
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
//        scheduledExecutorService.scheduleAtFixedRate(beeper, 1, 5, TimeUnit.SECONDS);
        final ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(beeper, 1, 5, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Cancelando");
                scheduledFuture.cancel(false);
                scheduledExecutorService.shutdown();
            }
        }, 10, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        beep();
    }
}