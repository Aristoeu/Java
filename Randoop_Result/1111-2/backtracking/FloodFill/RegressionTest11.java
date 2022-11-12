package backtracking.FloodFill;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) (short) -1, 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 52, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 0, (int) (short) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (-1), 52, 100);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) (byte) 10, (int) (short) -1);
        int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, 32);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) 100, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) (short) -1, 0, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) '#', (-1), (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 10, 32, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 100, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, (-1), (int) (short) -1);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 0, (int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) 'a', (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) (byte) 10, 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 32, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 100, (int) (byte) -1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 0, (int) (short) -1, 32);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, (int) (short) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) ' ', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 0, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 1, 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 100, (-1), 52);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) -1, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 10, (int) ' ', 10);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) (byte) 0, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (-1), (int) '#', (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) (short) 100, (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, 10, 35, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (short) -1, 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (short) 0, 35, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', 35, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, 10, (int) 'a');
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 0, (int) (byte) 100, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) ' ', 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) '#', (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) 'a', (int) (short) 0, (int) (byte) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) -1, (int) (short) 100, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 0, 0, (int) 'a', 0);
        java.lang.Class<?> wildcardClass92 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 32, (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass36 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 0, (-1), (int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) '4', 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) (byte) 1, 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (byte) 0, (int) (short) 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 100, (int) (short) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 52, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (short) 0, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) ' ', (int) '#', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 35, 52, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 100, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 32, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 0, (int) (short) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (-1), 52, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 0, (int) (byte) 0, 100);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), (int) 'a', (-1), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 52, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 100, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 10, (int) (byte) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, 0);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 10, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (-1), 100);
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '4', 52, (int) (short) 0);
        java.lang.Class<?> wildcardClass56 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (-1));
        int int31 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 1, (int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, 52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 100, 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) 'a', 35, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) ' ', 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 10, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) '4', (int) (byte) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass49 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) '#', (int) (short) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass36 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) -1, 1, 35);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '#', (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass65 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (-1), (int) ' ', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 1, (int) (short) -1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) '#', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 32, 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass61 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, 0, 0, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 52, (int) (byte) 0, 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, 32, 32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) -1, (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) 'a', 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) '4', (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) -1, (int) (byte) 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) -1, (-1), 1);
        int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1 + "'", int59 == 1);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '4', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) '4', (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 10, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) -1, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 35, (int) (byte) 1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 0, (int) 'a', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) 0, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) '#', (int) (byte) 1, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (short) 10, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 1, (int) (short) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, 100, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 100, 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) -1, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 100, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 1, 32, (int) (short) 0);
        int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 0, 32, 35);
        int int70 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int73 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 100 + "'", int70 == 100);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 100, (int) (byte) 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) (short) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (-1), (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass54 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (byte) -1, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (short) 10, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 10, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (short) 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), (int) '#', (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) (short) 10, (int) (short) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) ' ', (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) 'a', (int) (short) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) '#', (int) (byte) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) -1, (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, 0, (int) (short) 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (-1), 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) '4', 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 32, (int) (short) 10, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) ' ', 52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 0, (int) (byte) 10, (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 52, (int) (short) 1, (int) (short) 0, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', 1, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) 'a', (int) '#', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (-1), 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) '4', (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 52, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) '#', (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) 'a', (int) (short) 0, (int) (byte) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) -1, (int) (short) 100, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 0, 0, (int) 'a', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 100, (int) (short) -1, (int) (byte) 10, (int) (byte) 10);
        int int99 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + 100 + "'", int99 == 100);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, 52, 0);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 0, 32, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 35, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 0, 100, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 0, (int) '4', 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (byte) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) -1, (int) (short) 100, (int) (short) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 32, 1, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) -1, (int) (short) 1, 32, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '#', (int) (byte) 10, (int) (byte) 0, 32);
        int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (short) 10, 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '4', (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 100, 52, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) -1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 32, (int) '#', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 100, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) (byte) 1, 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (byte) 0, (int) (short) 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) 1, (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) '4', (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) 'a', (int) (short) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 1, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 0, 32, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 35, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 35, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (short) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, (int) (short) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) ' ', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 35, (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 10, (int) '4', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) -1, 10, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 100, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 35, (int) (byte) 10, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 52, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (-1), (int) (byte) -1, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 1, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) ' ', (-1), 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 100, (int) (short) 0, (int) ' ');
        int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) 'a', (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', 35, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, 10, (int) 'a');
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 0, (int) (byte) 100, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (short) 10, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 100, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 32, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 0, (int) '4', 52);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, 100, (int) ' ', (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) ' ', 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) '4', (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) 'a', (int) (short) 100, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 0, (int) (byte) -1, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 52, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '#', (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '#', (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) -1, 0, (int) (byte) -1);
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 0, 1, (int) (short) 10);
        int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) -1, 1, 35);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 1, (-1), 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 10, (int) ' ', (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) ' ', (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 52, (int) ' ', 100);
        java.lang.Class<?> wildcardClass90 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 1, (int) (short) 10, 35);
        int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) -1, (-1), (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 35, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 1, (-1), 32);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (short) 0, 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '4', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 32, 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, 100, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 0, (int) (short) 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) 'a', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 0, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 52, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) -1, (int) (byte) 100, 32);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 1, 52, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) ' ', (int) '#', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 10, 52, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) -1, 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 1, 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass34 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 0, (int) (short) 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 0, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) 'a', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 0, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, 35, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, 32, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int63 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 32, (int) (short) -1, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 10, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) '4', (int) '4', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 1, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 35, 35, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, 100, (int) ' ', (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) ' ', 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 100, (int) (byte) 100);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 1, 1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 1, (int) (byte) 1, 100);
        int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 0);
        int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 0);
        int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) '4', 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) 10, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) 'a', (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) '#', (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) 'a', (int) (short) 0, (int) (byte) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) -1, (int) (short) 100, (int) (short) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (short) 10, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, (-1));
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 1 + "'", int53 == 1);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 100, (int) (byte) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 32, (int) 'a', 35);
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) -1, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 1, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) 'a', 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 0, (int) (short) -1);
        int int66 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, 32, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 1, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 1, 100, (-1), (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) -1, (int) (byte) 1, (int) (byte) 1, 52);
        java.lang.Class<?> wildcardClass77 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 1, (int) (short) 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, (int) ' ', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 0, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', (int) '#', 100);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) '#', 100, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (byte) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) ' ', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 32, 0, 0);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (byte) 10, (int) ' ', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 100, 35, (int) '4');
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) '#', 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, 32, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 52, 100, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 0, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 0, (int) (short) 10, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 100, (int) (byte) -1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '4', (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) -1, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 1, 32, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 1, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass65 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), (int) '#', (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 0, 32, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '4', (int) (short) -1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', 32, 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', (int) (short) 10, (int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass25 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, (int) (short) 0, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 10, (int) (short) 100, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (-1), 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 35, (int) ' ', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, (int) (short) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 32, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (-1), (int) 'a', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) '#', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) -1, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (-1), (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int74 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, 10, 35, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (short) -1, 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (short) 0, 35, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 100, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 100, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 10, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, 100, (int) ' ', (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) ' ', 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 35, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 0);
        int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 100, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) 'a', 32, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) ' ', 35, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (-1), (int) (short) -1, (int) (byte) 1);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '#', (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', (int) (short) 10, 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (byte) 0, (int) 'a', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 0, (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 0, (int) '#', 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) -1, (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) '#', 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) ' ', (int) ' ', 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (-1), (int) (short) -1, (-1));
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) 'a', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 1, (int) (byte) 10, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '4', (int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (int) (byte) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 1, (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 10, 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (-1), (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) -1, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 35, 10, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) 'a', 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) '4', (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 100, (int) ' ', (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 52, 0, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, (int) '#', (int) '4', 35);
        java.lang.Class<?> wildcardClass48 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, (int) (byte) 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, 0, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) -1, (int) (short) 100, (int) (short) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 32, 1, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) -1, (int) (short) 1, 32, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 1, (int) '#', 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 10, (int) (byte) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 10, 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) -1, (int) 'a', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 1, (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', 10, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) 'a', 35, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 100, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (byte) 10, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 100, (int) 'a', 100);
        int int31 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, 35, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 52, (int) (byte) 1, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 1, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 0, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 0, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) (byte) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 10, 52, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 32, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 1, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) ' ', (-1), 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) ' ', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), (int) (short) 100, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, (int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) -1, (int) (short) 10, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 32, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 52, (int) (short) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) (byte) 1, 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 100, (int) (byte) 100, 32, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (byte) 1, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 35, (int) (short) -1, 0, (int) ' ');
        java.lang.Class<?> wildcardClass81 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', (int) '#', 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 0, (int) (byte) 10, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) -1, (int) 'a', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 52, 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 100, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 100, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) -1, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 1, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) 'a', 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) '#', 52, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 100, (-1), (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 0, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 35, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, (int) (byte) 10, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 32, (int) '#', 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 32, 35, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) '#', (-1), 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 52, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, (int) (short) 0, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 52, (int) (short) -1, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', (int) (byte) -1, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, 32, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 0, 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) -1, (int) 'a', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 1, (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', 10, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) 'a', 35, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), (int) '4', 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) 'a', (int) '#', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (-1), 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) '4', (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (byte) 0, (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 35, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, 0, (int) (short) 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 100, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, (int) (short) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 32, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), (int) 'a', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) ' ', 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 10, (-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) 'a', 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 10, (int) (byte) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) -1, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) 'a', (int) '#', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 1, (int) 'a', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 10, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass54 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 0, 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (-1), 32);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 100, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 100, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 10, (int) ' ', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) ' ', 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 32, 100, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 32, 32, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 10, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 52, (int) (byte) 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 100, (int) (byte) 100, 32, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) 'a', (int) ' ', 10);
        int int79 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (short) 1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 35 + "'", int79 == 35);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) ' ', (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 52, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '4', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 32, 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 35, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 0, (int) (byte) -1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 0, (int) '4', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) 'a', (int) (byte) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) '#', (int) 'a', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 1, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 52, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), (int) '#', (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 100, (int) ' ', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 0, 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (short) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 1, (int) ' ', (int) (short) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 100, (int) (short) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass66 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) (short) 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) '#', (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) (short) 0, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) '#', (-1), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 0, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 1, (int) (byte) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, 0);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 10, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (-1), 100);
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 32, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 1, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 10, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (-1), (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) (byte) 10, (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) '4', 32, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, 10, (-1), (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 100, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 100, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) (byte) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, 35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) ' ', 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, (int) 'a', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, (int) (byte) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', 1, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) '4', (int) '4', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 10, (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, (-1), 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 1, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 10, 35, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) '#', (int) (byte) -1, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (byte) -1, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (short) 10, (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) 'a', (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 52, 35, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, 10, (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (short) 1, 35, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 10, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 10, 1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 1, (int) (byte) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 52, (-1), 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, (int) (short) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) ' ', 35, 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 10, 35, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 0, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 100, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) -1, 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) -1, (int) '#', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, 32, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 10, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 52, (int) (short) -1, (int) (short) 100);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, (int) (short) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 32, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (-1), (int) 'a', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) '#', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 1, 52, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 10, 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (byte) 10, (int) ' ', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (byte) 1, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 100, 35, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 52, (int) (short) 1, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (-1), 52, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) -1, (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) -1, 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (byte) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 35, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (-1), (int) (byte) -1, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 10, (int) ' ', 32);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) '#', (int) (byte) -1, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 32, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 52, (int) ' ', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '#', (int) 'a', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (-1), (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 52, (-1), 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) ' ', (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, (int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass67 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, 100, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 52, 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, 0);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 10, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (-1), 100);
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 32, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, 32, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) '4', (int) (byte) 1, 1);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        int[][] intArray0 = null;
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (-1), (int) (short) 1, (int) (short) 10, 10);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 100, (int) '#');
        int int43 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (byte) 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) '#', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, (int) (byte) 10, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (-1), (int) '#', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) '#', (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass40 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) -1, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, (int) (short) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) ' ', 35, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) -1, (-1), (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 35, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (-1), (int) (short) 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) ' ', 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 100, (int) (byte) -1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 0, (int) (short) -1, 32);
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (-1), 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) 'a', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 0, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, 35, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, (int) (short) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 32, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (-1), (int) 'a', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) '#', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) -1, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (-1), (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int74 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 32, (int) (byte) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) 'a', 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) ' ', 35, (int) 'a');
        java.lang.Class<?> wildcardClass56 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, (int) (short) -1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 32, (int) 'a', 10);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 10, (int) (byte) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 10, 32, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 100, 52, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 10, (int) (short) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 0, 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 52, (int) (byte) 0, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 0, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) -1, (int) (short) 1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '#', (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 100, 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 1, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, 100, (int) '#');
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 100, 35, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 1, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 0, (int) 'a', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', (int) (short) 1, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '#', (int) 'a', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (-1), (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (short) -1, (int) (byte) 1);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 100, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) -1, 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) -1, (int) '#', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, 32, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 1, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 35, (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (int) (short) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '4', (int) (short) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 10, (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 10, (int) (byte) 10, (int) '4');
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 100, (int) (byte) 100);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 35, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (-1), (int) (byte) -1, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 35, (int) 'a', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 35, 52, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), 35, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 0, 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (short) 10, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) ' ', (int) ' ', 0);
        java.lang.Class<?> wildcardClass54 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) -1, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 1, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) 'a', 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) 100, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) (byte) 0, (int) (byte) 1);
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (byte) 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, (int) (short) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass57 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 100, (int) (byte) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, 0);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 10, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (-1), 100);
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 32, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '#', (int) (short) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) -1, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 10, (-1), (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 100, (int) ' ', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 1, (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 1, (int) (short) 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, (int) ' ', (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 100, (-1), (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 1, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 10, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) '4', 35, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 0, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 1, 1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int71 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) ' ', (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, (int) (short) 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (-1), (int) '#', 35);
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) -1, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) '#', (int) (byte) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 1, (int) 'a', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', 0, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 10, (int) '4', (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 1, (int) (byte) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass45 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) -1, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 0, 100, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 100, (int) '#', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 52, (int) (short) 100, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) 'a', (int) (byte) 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass46 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 10, (int) (byte) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 10, 32, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, 10, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 10, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (byte) 1, (int) ' ', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 52, (int) (byte) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) ' ', (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (byte) -1, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 0, 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (short) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 1, (int) ' ', (int) (short) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 1, (int) (byte) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 32 + "'", int56 == 32);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '4', (int) (short) -1, 32);
        int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, (int) (short) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) ' ', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 1, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) (short) 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 0, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 0, (int) 'a', 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 0, (int) '4', (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 35, (int) (short) 10, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 100, 32, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (short) -1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) -1, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, 35, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (short) -1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 1, 35, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, (int) ' ', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', 0, (int) ' ');
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 1, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) -1, 35, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 100, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 100, (int) (short) 10, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) -1, (int) 'a', (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 35, 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int43 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 35, 10, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 1, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass55 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) -1, 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 100, 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 52, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 0, (int) (byte) 1, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) -1, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) '4', 35, (int) '4');
        int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, (int) (short) 0, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 0, (int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass49 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) (byte) 0, (int) (byte) 1);
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) -1, (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 35, 10, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) '4', (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 1, 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 0, 32, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 35, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) (byte) 0, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (-1), (int) '#', (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) (short) 100, (int) '4', (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, 0, 1, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', 35, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, 10, (int) 'a');
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 0, (int) (byte) 100, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass60 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 32, 100, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) '#', (int) (short) 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) '4', (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (-1), (int) (byte) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 10, (int) (byte) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 0, 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 1, (int) '#', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 52, (int) (byte) 100, 100);
        int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) 0, (int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 0, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (-1), (int) '#', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) '#', (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '4', (int) (short) 1, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) -1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 100, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 1, 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) (byte) 0, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (-1), (int) '#', (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) -1, (int) ' ', (int) (short) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) '#', (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 35 + "'", int38 == 35);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 1, 32, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 0, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 100, 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, (int) (short) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 32, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (-1), (int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 1, (int) ' ');
        int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass49 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 10 + "'", int48 == 10);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, (int) (short) 1, 35);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) ' ', (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass45 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 0, (int) '4', 1);
        java.lang.Class<?> wildcardClass36 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, (int) (short) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 32, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) 'a', (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '#', 52, (int) (byte) 1);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 100, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 100, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 10, (int) ' ', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass64 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) ' ', 10, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 32, (-1), (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass50 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) (short) 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 0, (-1), (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 10, (int) (byte) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 10, 32, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) 'a', (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (-1), (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 100, (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 100, (int) '4', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, 10, 0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) -1, (int) (short) 100, (int) (short) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 32, 1, (int) (short) 100, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) -1, (int) (short) 1, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (short) 0, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) (short) 100, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) (short) 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 0, 32, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 0, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 35, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) 'a', (int) (byte) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 1, (int) '#', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) 'a', 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 35, (int) (byte) 100, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 10, (-1), 32);
        java.lang.Class<?> wildcardClass27 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) '#', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (int) ' ', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 10, (int) '4', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, (int) (short) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 32, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (-1), (int) 'a', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) '#', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 1, 52, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 10, 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), (int) '#', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) -1, (int) '4', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, 35, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 0, 100, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 1, (int) (short) -1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) '#', 35, 1);
        int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 0, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) ' ', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) 'a', 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 100, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 1, 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '#', (int) 'a', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 0, 52, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 0, 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 52, (int) (short) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 0, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (byte) -1, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) 1, (int) ' ', 100);
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) 100, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, 1, (int) '4', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 100, (int) (byte) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 32, (int) 'a', 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) (byte) 10, 35, 32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) 'a', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 52, (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, 35, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, 10, 35, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (short) -1, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) '4', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, 0, 0, (int) ' ');
        int int74 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, 0);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 10, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (-1), 100);
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '4', 52, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 10, (int) (short) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) 'a', (int) (byte) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 100, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) 'a', (int) ' ', (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) (byte) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 100, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 32, 1, (int) 'a');
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) 'a', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 0, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, 35, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 0, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 1, 32, (int) (short) -1);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 1, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) 'a', (int) '4', 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) ' ', 0, 35, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray4, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 10, 35, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 1, (-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (-1), (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 10, (int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 100, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 100, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 35, 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (byte) -1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) -1, 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 100, (-1), (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 100, (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 32, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', (int) '#', 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 0, (int) (byte) 10, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 0, 32, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 1, 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 35, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (short) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 0, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 52, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (-1), (int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass80 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 10, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (byte) 1, (int) ' ', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 52, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) '4', 52, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 10, (int) '#', (int) (byte) 0);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (short) 0, 0);
        int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 1, 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, (int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) 'a', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 0, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, 35, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 35, 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 52, (int) (byte) 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 1, 10, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '#', (int) 'a', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 100, (int) (short) 100, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (-1), (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) (byte) 1, 0, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 32, (int) (byte) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass44 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) 'a', (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (short) 1, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 0, (int) (short) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', (int) (short) 1, 32, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (short) -1, (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) '4', 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, (int) (short) -1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 32, (int) 'a', 10);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (-1), (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) -1, (int) (byte) 1, (int) (byte) -1);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass59 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 0, (int) 'a', (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 1, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, (int) (byte) -1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 35, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 10, (int) (byte) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 1, 52, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 10, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) '4', (int) '4', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 1, 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, 10);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 10, (int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 10, (int) 'a', 35);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass45 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 10, (int) '4', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 52, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 10, 0, 10);
        int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 32, (int) (short) -1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '4', (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 1, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 1, 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '#', (int) ' ', (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 10, (int) (short) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 0, (int) (short) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 1, (int) (short) 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, (int) ' ', (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 1, 35);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, 35, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 100, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) '#', (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 10, 32, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (-1), 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (-1), 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) 100, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 100, 100, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 10, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 1, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) ' ', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 0, (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 1, (int) (short) -1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) '#', 35, 1);
        int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 0, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) ' ', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) 'a', 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 52, (int) (byte) 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) -1, 35, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 10, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 32, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 10, (int) (short) 0, (int) (byte) -1);
        int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 1);
        int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (short) 0, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (byte) 0, (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 35, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, 0, (int) (short) 0, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 52, (int) (short) -1, 10);
        java.lang.Class<?> wildcardClass53 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 1, 32, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 0, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass70 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 0, 35, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 1, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) ' ', (-1), 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) ' ', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 0, 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 35, 10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) '4', 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, 35, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 52, 0, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) (byte) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) -1, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (byte) 1, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (short) 0, (int) '4', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) 'a', (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) -1, 1, 35);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '#', (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) ' ', (int) (byte) 1, 100);
        int int72 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (int) ' ', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 32, 35, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) '#', (-1), 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 52, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', (int) ' ', (int) (short) -1);
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) 'a', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) (byte) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) (byte) 0, (int) (byte) 1);
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (byte) 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) -1, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 1, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) '4', (int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, 10);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 100, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 1, (int) ' ', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 100, (int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 10, (int) ' ', (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) -1, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 10, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, 52, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), 35, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 0, (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) -1, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 100, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) 1, 10, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) '4', (int) (byte) 1, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 100, (int) (byte) 100, 32, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 1, 0, 32, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 10, (int) (short) 0, (int) '#', (int) (byte) 1);
        java.lang.Class<?> wildcardClass82 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (int) ' ', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 32, (int) (short) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) 'a', (int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 0, (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (-1), 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 52, 10, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) (short) 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 0, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) -1, (int) (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) ' ', 10, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 32, (-1), (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 1, (int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) -1, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, (int) (short) 10, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '#', (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) '4', (int) '4', (int) (byte) 1);
        java.lang.Class<?> wildcardClass55 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, (int) 'a', 1);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 1, (int) (byte) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, (int) (byte) 10, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) ' ', 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 10, 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, (int) (byte) -1, 0);
        int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) -1, (int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 52, (int) (byte) 100, 100);
        java.lang.Class<?> wildcardClass44 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (-1), 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) -1, 0, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 0, 32, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', (int) (short) 1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) ' ', 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', (int) ' ', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, 10, (int) (short) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) ' ', 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 1, (int) '4', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, 0, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 35, (int) ' ', 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) -1, (int) ' ', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) '4', (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 10, (int) (short) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, (int) '#', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 100, (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 32, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '4', (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass61 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) -1, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) ' ', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (short) -1, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 100, (int) (short) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, (int) (byte) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 10, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (byte) -1, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) (short) -1, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) 'a', (int) (short) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 1, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', (int) (byte) 0, (int) '#');
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 100, (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass48 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 1, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) -1, 35, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 100, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 100, (int) (short) 10, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) ' ', (-1), 100);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 100, 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 52, (int) (short) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, 10, (int) ' ', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) '#', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) 'a', (int) (short) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) '#', (int) (byte) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 100, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 35, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (-1), (int) (byte) -1, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) -1, (int) '4', 32);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) 'a', 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) '4', (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 100, (int) ' ', (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 52, 0, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, (int) '#', (int) '4', 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 10, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '4', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 32, 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 0, (int) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) -1, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 0, (int) (byte) 10, (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 52, (int) (short) 1, (int) (short) 0, 52);
        java.lang.Class<?> wildcardClass61 = intArray30.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) (short) 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) 'a', 35, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 52, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 1, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) -1, 35, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 10, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 10, (int) 'a', 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 0, (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) -1, 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 35, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (-1), (int) (byte) -1, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 1, (int) (byte) -1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 0, (int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 100, (int) (byte) 100);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 1, 1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 1, (int) (byte) 1, 100);
        int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 0);
        int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 32, (int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (-1));
        java.lang.Class<?> wildcardClass46 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (byte) 100, 0, 0);
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (byte) 1);
        int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, 0, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) (short) 1, 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 100, (int) (byte) 100, 32, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) 'a', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 0, (int) (byte) 1, (int) (byte) 1, 100);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 35 + "'", int56 == 35);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) ' ', (int) (byte) 100, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 100, 32, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) -1, (int) (short) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 10, (-1), (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 100, (int) ' ', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) '4', 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 1, (int) (byte) 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) -1, 35, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', (int) '#', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (byte) 10, (int) ' ', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 1, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) (short) 10, (int) (short) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 52, (int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 100, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 0, 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 52, (int) (byte) 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 1, (int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '4', (int) (short) 100, (int) (short) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (byte) -1, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 100, (int) ' ', (int) '4');
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }
}

