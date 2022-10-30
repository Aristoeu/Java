package UniquePaths;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test7501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7501");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7502");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) '#', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7503");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7504");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7505");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7506");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7507");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7508");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7509");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) '#', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7510");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7511");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7512");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7513");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7514");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7515");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7516");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) ' ', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7517");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) ' ', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7518");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7519");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7520");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7521");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7522");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7523");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7524");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7525");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7526");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7527");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7528");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7529");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7530");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7531");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7532");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7533");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7534");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7535");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7536");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7537");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7538");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7539");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7540");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7541");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7542");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7543");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7544");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7545");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) '#', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7546");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7547");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7548");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7549");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7550");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7551");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) 'a', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7552");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7553");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7554");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) '4', 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7555");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7556");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7557");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7558");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7559");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) 'a', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7560");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7561");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7562");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7563");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7564");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7565");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7566");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7567");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7568");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7569");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7570");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7571");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7572");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7573");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7574");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7575");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7576");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (short) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7577");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7578");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) '4', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7579");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7580");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7581");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7582");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7583");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7584");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7585");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7586");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7587");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7588");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7589");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7590");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7591");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7592");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7593");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7594");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) 'a', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7595");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7596");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) ' ', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7597");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7598");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7599");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7600");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7601");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7602");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7603");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7604");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7605");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7606");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7607");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7608");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) '4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7609");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7610");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7611");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7612");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7613");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7614");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7615");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7616");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7617");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7618");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7619");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7620");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7621");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7622");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7623");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7624");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7625");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7626");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7627");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7628");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7629");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7630");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7631");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7632");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7633");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7634");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) '#', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7635");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7636");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7637");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7638");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7639");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7640");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7641");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7642");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7643");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7644");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7645");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7646");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7647");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7648");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7649");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7650");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7651");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7652");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7653");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7654");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7655");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7656");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7657");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7658");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7659");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7660");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7661");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7662");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7663");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7664");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7665");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7666");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7667");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7668");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) '#', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7669");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7670");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7671");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7672");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7673");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7674");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7675");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7676");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7677");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7678");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7679");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7680");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7681");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7682");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7683");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7684");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7685");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7686");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7687");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7688");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) '#', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7689");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7690");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7691");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7692");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7693");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7694");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7695");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7696");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7697");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7698");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7699");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7700");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7701");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7702");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7703");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7704");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) ' ', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7705");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7706");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7707");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7708");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) '#', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7709");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (byte) 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7710");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7711");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7712");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7713");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7714");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7715");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7716");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7717");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7718");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7719");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (short) 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7720");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) 'a', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7721");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7722");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 1, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7723");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7724");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (short) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7725");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7726");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7727");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7728");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7729");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7730");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7731");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7732");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7733");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (short) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7734");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7735");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7736");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7737");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7738");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (byte) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7739");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7740");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7741");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7742");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7743");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7744");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) ' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7745");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7746");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7747");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7748");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7749");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7750");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7751");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7752");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7753");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7754");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7755");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7756");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7757");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7758");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7759");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7760");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7761");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7762");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7763");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7764");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7765");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (short) 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7766");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7767");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7768");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7769");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7770");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7771");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7772");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7773");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7774");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7775");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7776");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7777");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7778");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7779");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7780");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7781");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7782");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7783");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7784");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7785");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7786");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7787");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7788");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7789");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7790");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7791");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7792");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7793");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (short) 100, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7794");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) 'a', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7795");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7796");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7797");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7798");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7799");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7800");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) '#', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7801");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7802");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7803");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7804");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7805");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7806");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7807");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7808");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (byte) 10, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7809");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7810");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7811");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7812");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7813");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7814");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (byte) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7815");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7816");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), 10, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7817");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7818");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7819");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7820");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7821");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7822");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7823");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7824");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7825");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7826");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7827");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7828");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '#', (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7829");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7830");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7831");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7832");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7833");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7834");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7835");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7836");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7837");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7838");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7839");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7840");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7841");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) 'a', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7842");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7843");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7844");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7845");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7846");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (byte) 10, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7847");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7848");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7849");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7850");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7851");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7852");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7853");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7854");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7855");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7856");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7857");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(0, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7858");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7859");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7860");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (short) 10, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7861");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7862");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7863");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7864");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7865");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) '#', (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7866");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7867");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7868");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 100, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7869");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7870");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7871");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7872");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7873");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7874");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, 1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7875");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7876");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7877");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7878");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7879");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) 100, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7880");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, 10, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7881");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 0, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7882");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7883");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7884");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7885");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7886");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7887");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7888");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7889");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, 10, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7890");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 100, (int) (short) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7891");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7892");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7893");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7894");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7895");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7896");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7897");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) '4', 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7898");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) 'a', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7899");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7900");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7901");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7902");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, (int) (byte) 100, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7903");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7904");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7905");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7906");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7907");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7908");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(100, (int) '4', (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7909");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7910");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7911");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7912");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7913");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7914");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7915");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7916");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', (int) (short) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7917");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', (int) 'a', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7918");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7919");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) -1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7920");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (byte) 10, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7921");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7922");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7923");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7924");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7925");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7926");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7927");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((-1), (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7928");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, 10, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7929");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7930");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7931");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7932");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7933");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(10, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7934");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((-1), (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7935");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7936");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 100, (int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7937");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7938");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7939");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7940");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7941");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(1, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7942");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '#', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7943");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7944");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(100, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7945");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 0, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7946");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (short) 100, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7947");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7948");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7949");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7950");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7951");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(1, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7952");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, 1, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7953");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7954");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7955");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7956");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '#', (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7957");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (short) 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7958");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7959");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7960");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7961");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) -1, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7962");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) '#', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7963");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7964");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7965");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) 'a', (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7966");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 100, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7967");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 1, (int) (short) 100, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7968");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7969");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) ' ', (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7970");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7971");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7972");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) 'a', 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7973");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7974");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 10, (int) (short) 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7975");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) '4', 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7976");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7977");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7978");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 10, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7979");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7980");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, (int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7981");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) ' ', (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7982");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 10, (int) ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7983");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) '4', (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7984");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7985");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7986");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (byte) 100, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7987");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) -1, 10, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7988");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) -1, (int) (byte) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7989");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 0, (int) '#', (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7990");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7991");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 1, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7992");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7993");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (byte) 10, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7994");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7995");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2((int) (short) 1, (int) (byte) 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7996");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths2(10, (int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7997");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (byte) 0, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7998");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths(0, 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test7999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test7999");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) (short) 1, (int) (byte) 100, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test8000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test8000");
        boolean boolean3 = com.thealgorithms.dynamicprogramming.UniquePaths.uniquePaths((int) '4', 1, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }
}

