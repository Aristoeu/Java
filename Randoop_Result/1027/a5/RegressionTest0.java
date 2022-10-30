package a5;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        int int0 = com.thealgorithms.ciphers.a5.BaseLFSR.FRAME_COUNTER_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 22 + "'", int0 == 22);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        int int0 = com.thealgorithms.ciphers.a5.BaseLFSR.SESSION_KEY_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }
}

