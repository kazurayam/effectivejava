package effectivejava.chapter2.item9.trywithresources;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class CopyTest {

    @Test
    public void testCopyNonExistingFile() {
        try {
            File in = new File("./none");
            File out = File.createTempFile("foo", ".out");
            out.deleteOnExit();
            Copy.copy(in.toString(), out.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
