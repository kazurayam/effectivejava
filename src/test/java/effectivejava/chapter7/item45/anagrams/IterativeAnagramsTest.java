package effectivejava.chapter7.item45.anagrams;

import java.io.File;
import java.io.PrintWriter;

import org.junit.Test;

import effectivejava.chapter7.item45.anagrams.IterativeAnagrams;

public class IterativeAnagramsTest {

    @Test
    public void testSimple() throws Exception {
        File tempFile = File.createTempFile("IterativeAnagramsTest-", ".tmp");
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
