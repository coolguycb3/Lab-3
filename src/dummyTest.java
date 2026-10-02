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
        dummylink dum = new dummylink();

        dum.add(21);
        dum.add(67);
        dum.add(69);
        dum.add(420);

        assertTrue(dum.find(21));
        assertTrue(dum.find(67));
        assertTrue(dum.find(69));
        assertTrue(dum.find(420));
    }

    @Test
    public void testGetout(){
        dummylink DT = new dummylink();

        DT.add(600);
        DT.add(90);
        DT.add(5);
        DT.add(16600);

        assertTrue(DT.getout(16600));
        assertTrue(DT.getout(5));
        assertTrue(DT.getout(90));

        String result = captureOutput(() -> DT.show());

        assertEquals("600", result);
    }
}
