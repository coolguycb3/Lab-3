import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class dummyTest {
    private String captureOutput(Runnable method) {
        PrintStream original = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();

        System.setOut(new PrintStream(output));
        try {
            method.run();
        } finally {
            System.setOut(original);
        }

        return output.toString().trim();
    }

    @Test
    public void testAddItem() {
        dummylink list = new dummylink();

        list.add(10);
        list.add(20);
        list.add(30);

        String result = captureOutput(() -> list.show());

        assertEquals("10 20 30", result);
    }

    @Test
    public void testShowReverse() {
        dummylink list = new dummylink();

        list.add(10);
        list.add(20);
        list.add(30);

        String result = captureOutput(() -> list.showReverse());

        assertEquals("30 20 10", result);
    }
    @Test
    public void testFind(){

    }
}
