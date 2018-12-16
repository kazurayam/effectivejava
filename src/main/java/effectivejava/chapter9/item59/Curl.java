package effectivejava.chapter9.item59;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Curl {
    public static void main(String[] args) throws IOException {
        try (InputStream in = new URL(args[0]).openStream()) {
            // transferTo method was added at Java9
            //in.transferTo(System.out);
        }
    }
}
