package GCDRecursion;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(97, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 0, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(10, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '#', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 100, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(52, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 0, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(4, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(35, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(0, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 0, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(2, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd(52, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) ' ', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(97, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(5, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(32, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(100, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(2, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(35, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '4', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(10, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) ' ', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(4, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(4, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 10, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(35, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(35, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(35, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 10, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 0, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(32, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(52, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(0, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(2, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(4, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(4, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(52, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(32, 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd(97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(52, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(2, (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(97, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(97, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(32, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 32 + "'", int2 == 32);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(100, (int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(100, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(32, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 10, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd(4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(1, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(52, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) ' ', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '#', 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(100, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) 'a', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 0, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(4, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 1, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(5, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(52, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '#', 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(32, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '4', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(35, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(5, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd(97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(100, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) ' ', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(52, 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) 'a', 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) 'a', 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(97, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(5, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 100, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(1, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 1, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) ' ', 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(2, 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 10, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 1, 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) '4', 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) 1, 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd(32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 100, 97);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) 'a', 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd(1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd(2, 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        int int2 = com.thealgorithms.maths.GCDRecursion.gcd((int) (short) 100, 52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }
}

