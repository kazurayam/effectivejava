package effectivejava.chapter11.item78.brokenstopthread;

import java.util.concurrent.TimeUnit;

public class StopThread {

    private static boolean stopRequest;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequest)
                i++;
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequest = true;
    }
}
