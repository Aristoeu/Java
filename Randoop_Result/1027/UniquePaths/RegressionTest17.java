package UniquePaths;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test8501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8501");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8502");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8503");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8504");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8505");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8506");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8507");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8508");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8509");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8510");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8511");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8512");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8513");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8514");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8515");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8516");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8517");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8518");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8519");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8520");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8521");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8522");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8523");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8524");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8525");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8526");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8527");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8528");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8529");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8530");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8531");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8532");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8533");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8534");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8535");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8536");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8537");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8538");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8539");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8540");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8541");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8542");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8543");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8544");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8545");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8546");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8547");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8548");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8549");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8550");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8551");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8552");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8553");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) ' ', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8554");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8555");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8556");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8557");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8558");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8559");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8560");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8561");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8562");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8563");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8564");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8565");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8566");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8567");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8568");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8569");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8570");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8571");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8572");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8573");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8574");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8575");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8576");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8577");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8578");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8579");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8580");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8581");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8582");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8583");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8584");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8585");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8586");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8587");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8588");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8589");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8590");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8591");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8592");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8593");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8594");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8595");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) ' ', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8596");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8597");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8598");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8599");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8600");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8601");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8602");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8603");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8604");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8605");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8606");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8607");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8608");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8609");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8610");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8611");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8612");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8613");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8614");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8615");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8616");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8617");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8618");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8619");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8620");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8621");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8622");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8623");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8624");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8625");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8626");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8627");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8628");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8629");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8630");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '4', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8631");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8632");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8633");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8634");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8635");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8636");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8637");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8638");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8639");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8640");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8641");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8642");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8643");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8644");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8645");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8646");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8647");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8648");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8649");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8650");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8651");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8652");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8653");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8654");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8655");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8656");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8657");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8658");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8659");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8660");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8661");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8662");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8663");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8664");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8665");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8666");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8667");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8668");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8669");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8670");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8671");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8672");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8673");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8674");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8675");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8676");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8677");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8678");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8679");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8680");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8681");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8682");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8683");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8684");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8685");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8686");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) ' ', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8687");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8688");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8689");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8690");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8691");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8692");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8693");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8694");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8695");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8696");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8697");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8698");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8699");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8700");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8701");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8702");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8703");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8704");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8705");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8706");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8707");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8708");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8709");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8710");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8711");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8712");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8713");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8714");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8715");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8716");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8717");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8718");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8719");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8720");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8721");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8722");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8723");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8724");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8725");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8726");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8727");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8728");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8729");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8730");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8731");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8732");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8733");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8734");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8735");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8736");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8737");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8738");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8739");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8740");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8741");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8742");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8743");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8744");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8745");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8746");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8747");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8748");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8749");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8750");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8751");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8752");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8753");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8754");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8755");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8756");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8757");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8758");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8759");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8760");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) 'a', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8761");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8762");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8763");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8764");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8765");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8766");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8767");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8768");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8769");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8770");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8771");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8772");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8773");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8774");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8775");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8776");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8777");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8778");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8779");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8780");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8781");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8782");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8783");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8784");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (-1), (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8785");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8786");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8787");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8788");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8789");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8790");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8791");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8792");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8793");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8794");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8795");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8796");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8797");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8798");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8799");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8800");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8801");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8802");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8803");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8804");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8805");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8806");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8807");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8808");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8809");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8810");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8811");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8812");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8813");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8814");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) ' ', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8815");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8816");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8817");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8818");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) '#', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8819");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8820");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8821");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8822");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8823");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8824");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8825");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8826");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8827");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8828");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8829");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) 'a', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8830");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8831");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8832");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8833");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8834");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8835");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8836");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8837");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8838");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8839");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8840");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8841");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8842");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8843");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8844");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8845");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8846");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8847");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8848");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8849");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8850");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8851");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8852");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8853");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8854");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8855");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8856");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8857");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8858");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8859");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8860");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8861");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8862");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8863");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8864");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8865");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8866");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8867");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8868");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8869");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8870");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8871");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8872");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8873");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8874");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8875");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8876");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8877");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8878");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8879");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8880");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8881");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8882");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8883");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8884");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8885");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8886");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8887");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8888");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8889");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8890");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8891");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8892");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8893");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8894");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8895");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8896");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8897");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8898");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8899");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8900");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8901");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8902");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8903");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8904");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8905");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) 'a', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8906");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8907");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8908");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8909");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8910");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) '#', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8911");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8912");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8913");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8914");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8915");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) '#', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8916");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8917");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8918");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8919");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8920");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8921");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8922");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8923");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8924");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8925");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8926");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8927");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8928");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8929");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8930");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8931");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8932");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8933");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8934");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8935");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8936");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8937");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8938");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8939");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8940");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8941");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8942");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8943");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8944");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8945");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test8946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8946");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8947");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8948");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8949");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8950");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8951");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8952");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8953");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8954");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8955");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8956");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8957");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8958");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8959");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8960");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8961");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8962");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8963");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8964");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8965");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8966");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8967");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8968");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8969");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8970");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8971");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8972");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8973");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8974");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8975");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8976");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8977");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8978");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8979");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8980");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8981");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8982");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8983");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8984");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8985");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8986");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8987");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8988");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8989");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8990");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8991");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8992");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8993");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8994");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8995");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test8996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8996");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8997");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (byte) 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8998");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) 'a', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test8999");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test9000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test9000");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

