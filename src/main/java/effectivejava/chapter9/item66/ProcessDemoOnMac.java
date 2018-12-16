package effectivejava.chapter9.item66;

import java.io.IOException;

/**
 * Java code illustrating destory() method for Mac Operation System
 *
 */
public class ProcessDemoOnMac {
    public static void main(String args[]) throws IOException, Exception {
        System.out.println("Creating process");

        // creating process
        ProcessBuilder p = new ProcessBuilder(new String[]
                { "open", "/Applications/Facetime.app"}
        );
        Process pro = p.start();

        // waiting for 10 second
        Thread.sleep(10_000);

        System.out.println("destroying process");

        // destroying process
        pro.destroy();

        System.out.println("exit value: " + pro.exitValue());
    }
}
