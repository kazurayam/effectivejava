package effectivejava.chapter7.item45;

import effectivejava.chapter7.item45.anagrams.IterativeAnagrams;
import org.junit.Test;

import java.io.File;
import java.io.PrintWriter;

public class HybridAnagramsTest {

    @Test
    public void testSimple() throws Exception {
        File tempFile = File.createTempFile("HybridAnagramsTest-", ".tmp");
        tempFile.deleteOnExit();
        PrintWriter pw = new PrintWriter(tempFile);
        pw.println("staple");
        pw.println("petals");
        pw.flush();
        pw.close();
        String[] args = new String[] {tempFile.toString(), "1"};
        IterativeAnagrams.main(args);
    }
}
