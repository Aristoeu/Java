package FloodFill;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test08001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08001");
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
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) -1, (int) ' ', (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test08002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08002");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 100, (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) '4', 0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08003");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 35, (int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test08004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08004");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) '4', (int) (short) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) (byte) -1, (-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 0, (int) (byte) 1);
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
    public void test08005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08005");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 1, (int) (short) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 0, 32, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 35, 100, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 100, (int) 'a', (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test08006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08006");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (byte) 0, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 10, 35, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) ' ', (int) 'a');
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
    public void test08007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08007");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 1, (int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) -1);
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
    public void test08008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08008");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 10, (int) '#', (int) (byte) 0);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 0, (int) (byte) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, 52);
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
    public void test08009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08009");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08010");
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
        int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 1, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) (byte) 10, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) ' ', (int) (short) 10, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (int) (short) 10);
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
    public void test08011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08011");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), (int) '#', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 32, 32, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', 10, 52);
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
    public void test08012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08012");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) (short) 0, (int) (short) 0, 10);
        java.lang.Class<?> wildcardClass86 = intArray30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test08013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08013");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, 0, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 35, 1);
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
    public void test08014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08014");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test08015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08015");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) ' ', (int) '#', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) (byte) 1, (int) (short) 1);
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
    public void test08016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08016");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) (byte) 1, 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (byte) 0, (int) (short) 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 35, (int) (short) 10, 52);
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
    public void test08017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08017");
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
        int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 35, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int60 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
    }

    @Test
    public void test08018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08018");
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
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 100, 32);
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
    public void test08019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08019");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) '4', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) '4', (int) ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08020");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, (-1), (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '#', (int) ' ', (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08021");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, 35, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', 10, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 1, (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) '4');
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
    public void test08022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08022");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) (short) 0, 1);
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
    public void test08023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08023");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) (short) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08024");
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
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) ' ');
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
    public void test08025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08025");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) '4', 52);
        java.lang.Class<?> wildcardClass38 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test08026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08026");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 35, (int) (byte) 1, 52);
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
    public void test08027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08027");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (-1), (int) (short) -1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) '#', 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 100, (int) 'a', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 100, 1);
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
    public void test08028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08028");
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
        // The following exception was thrown during execution in test generation
        try {
            int int79 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 52, (int) (byte) -1);
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
    public void test08029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08029");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, (-1), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, 100, 10);
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
    public void test08030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08030");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '4', (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) (byte) -1);
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
    public void test08031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08031");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 10, (int) 'a', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test08032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08032");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 1, (int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (short) -1, 10);
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
    public void test08033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08033");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 10, (int) (byte) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 10);
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
    public void test08034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08034");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) -1, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, 35, 10);
        java.lang.Class<?> wildcardClass64 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test08035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08035");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 1, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) 10);
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
    public void test08036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08036");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 1, 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '#', (int) ' ', (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), (-1), (int) ' ');
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test08037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08037");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, 0, (int) ' ', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, 35, (int) (short) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (-1), (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 10, 100, (int) '#');
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
    public void test08038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08038");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 1, (int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08039");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 10, (int) (byte) 10, (int) (byte) 100);
        int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass53 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test08040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08040");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 1, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) ' ', (int) (short) 10, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, 35, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08041");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) 'a', (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, 100, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 52, (int) (short) 100, 100);
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
    public void test08042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08042");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass43 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test08043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08043");
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
        java.lang.Class<?> wildcardClass65 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test08044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08044");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, 35, (int) (short) 10);
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
    public void test08045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08045");
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
        int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 52, (int) (byte) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
    }

    @Test
    public void test08046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08046");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) -1, (-1), (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', 0, 0);
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
    public void test08047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08047");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, (int) ' ', 10);
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
    public void test08048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08048");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08049");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 100, (int) '4', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 52, (int) (short) 1);
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
    public void test08050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08050");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 35, (int) ' ', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (-1), (int) (short) 10, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, 32, (int) (short) 0);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test08051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08051");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, 1);
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
    public void test08052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08052");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (byte) 10, (int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test08053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08053");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, (int) 'a', 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 32, (int) '4', 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (int) (byte) 100, (-1));
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
    public void test08054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08054");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 10, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) -1, 1, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08055");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test08056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08056");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, 35, 0);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass34 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test08057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08057");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 0, (-1), 100);
        java.lang.Class<?> wildcardClass65 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test08058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08058");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08059");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, 52, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (byte) -1);
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
    public void test08060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08060");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, 0, (int) (short) -1);
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test08061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08061");
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
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (short) 100);
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
    public void test08062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08062");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (short) 1, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08063");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 0, (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 35, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 100, (int) (short) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test08064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08064");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 1, (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 0, 35, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) (byte) 1);
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
    public void test08065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08065");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '4', (int) (byte) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) 'a');
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
    public void test08066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08066");
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
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) '#');
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
    public void test08067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08067");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test08068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08068");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) 'a', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) -1, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) -1, (int) (byte) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 35);
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
    public void test08069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08069");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 10, 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test08070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08070");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 0, (int) (byte) 1, (int) 'a', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 0, 32, (int) (short) 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 10, (int) (byte) 10, (int) 'a', (int) (short) 10);
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
    public void test08071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08071");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) 'a', (int) '4', 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) (byte) 1, (-1), (int) (short) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, 0, (int) (byte) 0, (-1), (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) (byte) -1, 35, 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, 1, (int) (byte) 10, (int) ' ', 52);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test08072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08072");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 100, (int) (byte) 1, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 0, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) -1, (int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test08073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08073");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 100, (int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) (byte) 1, (int) (short) 10);
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
    public void test08074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08074");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) ' ', 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 100);
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
    public void test08075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08075");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (byte) 0, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 10, 35, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, 0, 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 1, (-1), 100);
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
    public void test08076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08076");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) '#', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, (int) (short) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) -1, (int) (short) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', 1);
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
    public void test08077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08077");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 10, (int) '#', (int) (byte) 0);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, 0);
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
    public void test08078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08078");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (-1), 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) '4', (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (-1), (int) (byte) 0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08079");
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
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test08080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08080");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 100, 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) -1, 10, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (short) 1, (int) '#');
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
    public void test08081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08081");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 1, (int) 'a');
        int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
    }

    @Test
    public void test08082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08082");
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
        int int61 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, 1, (int) (short) 100, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 35 + "'", int61 == 35);
    }

    @Test
    public void test08083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08083");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) -1, 0, 0);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test08084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08084");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (-1), (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08085");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 0, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) 1, (-1), 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) '#', 0, (int) (byte) 10);
        int int73 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
    }

    @Test
    public void test08086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08086");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, (int) '#', (int) (short) 1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test08087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08087");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, 10);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 0, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) -1, (int) '#', (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test08088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08088");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', (int) (short) 10, 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 1, (int) ' ', 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 35, 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08089");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 100, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 35, (int) ' ', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) '#', (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass80 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test08090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08090");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '4', 32, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) (byte) 0, (int) (short) 10);
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
    public void test08091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08091");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 0, 1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 52, (int) (byte) -1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', 32, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) -1, 100, 100);
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
    public void test08092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08092");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) '4', 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 10, 32, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08093");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 1, 32, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 100, (int) (short) 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 10, (int) 'a', 52);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 10);
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
    public void test08094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08094");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, 35, 0);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) '4', 32, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', 0, 100);
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
    public void test08095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08095");
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
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) '#');
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
    public void test08096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08096");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 0, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass94 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test08097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08097");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 10, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 10, 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08098");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', 100, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08099");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 0, (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 0, (int) '#', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, 100, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', 0, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 0, 52);
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
    public void test08100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08100");
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
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), 1);
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
    public void test08101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08101");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 1, 32, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (-1), 35, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, 32);
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
    public void test08102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08102");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) -1, 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08103");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (short) 0, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 1, 0);
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
    public void test08104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08104");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 0, (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (-1), 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 0, (int) (byte) -1, (int) (byte) 100);
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
    public void test08105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08105");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), (int) '#', (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 100, 52, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 52, (int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) (short) -1);
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
    public void test08106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08106");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) '#', 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (-1), (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 100, (int) (byte) 100, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (byte) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 1, (-1), (int) (short) 1);
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test08107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08107");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (-1), 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (-1), (int) '#');
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
    public void test08108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08108");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, (-1), (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 10, (int) (byte) 10, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int72 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (byte) 1);
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
    public void test08109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08109");
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
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 10, (int) (short) 0);
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
    public void test08110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08110");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 1, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, (int) (short) 10);
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
    public void test08111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08111");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 32, (int) ' ', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) '4', 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, 52, (int) '4');
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
    public void test08112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08112");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, 35, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', 10, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 1, (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) ' ');
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
    public void test08113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08113");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) '#', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (int) ' ', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 32, (int) (byte) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) (short) 0);
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
    public void test08114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08114");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '4', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) ' ', (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08115");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) ' ');
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
    public void test08116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08116");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (byte) 0, (int) (short) -1);
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
    public void test08117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08117");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 100, (int) (short) 100, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test08118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08118");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) 100, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) (short) -1, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 1, (int) (short) -1);
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
    public void test08119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08119");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 0, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) '#', (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 35, (int) (short) 10, 52);
        java.lang.Class<?> wildcardClass72 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test08120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08120");
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
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (byte) 1);
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
    public void test08121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08121");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 100, (int) 'a');
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
    public void test08122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08122");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 1, 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) -1, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) (byte) 0, (int) '4');
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
    public void test08123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08123");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 100, (int) (short) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', (int) 'a');
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
    public void test08124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08124");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 0, (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 35, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 100, (int) (short) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, 10);
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
    public void test08125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08125");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 100, (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) '4', (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08126");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) 'a', (-1), (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 0, (int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08127");
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
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 35, (int) (short) 0);
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
    public void test08128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08128");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 10, 0);
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
    public void test08129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08129");
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
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) '#');
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
    public void test08130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08130");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) ' ', 100, 10);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test08131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08131");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 1, (int) 'a', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) -1, (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) '#', (-1), 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) (short) 100, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, 1, (int) '#', (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 35, 35, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) 'a', (int) (byte) -1);
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
    public void test08132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08132");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 0, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) -1, (int) (short) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) '4', (int) (byte) 1);
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
    public void test08133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08133");
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
        int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test08134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08134");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 100, (int) (short) 1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', 0, 32, 100);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test08135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08135");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 52, (int) (byte) 10, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 52);
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
    public void test08136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08136");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) (short) 0, 0, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08137");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (byte) 10, (int) ' ', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 52, (int) (short) -1, 10, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (byte) 1, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 0, 0);
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
    public void test08138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08138");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08139");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) -1, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 10);
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
    public void test08140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08140");
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
        // The following exception was thrown during execution in test generation
        try {
            int int74 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 52, (int) (byte) 1);
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
    public void test08141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08141");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) (short) 0, 32, (int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08142");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 1, 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int77 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, 1);
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
    public void test08143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08143");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08144");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 52, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, 35);
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
    public void test08145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08145");
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
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 100);
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
    public void test08146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08146");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '4', (int) (byte) 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', (int) (byte) 100, 0);
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
    public void test08147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08147");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (byte) 10, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08148");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 32, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, (int) (byte) 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) 'a', 0);
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
    public void test08149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08149");
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
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 100, (int) (byte) 100);
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
    public void test08150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08150");
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
        int int61 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', (int) '#');
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
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 10 + "'", int61 == 10);
    }

    @Test
    public void test08151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08151");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, (int) (byte) -1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) 'a', 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (-1), (int) '4', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 0, (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 0, (int) 'a', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) '4', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test08152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08152");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) 'a', (int) (byte) 0);
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
    public void test08153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08153");
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
        int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test08154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08154");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, 52, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) 'a', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test08155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08155");
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
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) (byte) 100);
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
    public void test08156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08156");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) 'a', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 1, (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) -1, 100, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08157");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test08158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08158");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 35, 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 100, 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass65 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test08159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08159");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 0, 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 1, (int) (short) 10, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test08160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08160");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 100, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) (short) -1, 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', 1, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 52, 52, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 1, 0, (int) (short) -1);
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
    public void test08161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08161");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, (int) (byte) -1, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 0, (int) (short) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) 'a', (int) '#', 10);
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
    public void test08162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08162");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (byte) 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) 'a', (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) (short) 100);
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
    public void test08163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08163");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 52, (int) 'a', (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08164");
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
        int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 10, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 52, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test08165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08165");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 10, 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, 10);
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
    public void test08166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08166");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 100, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) '4', 32, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) -1, 1, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, 52, (int) (byte) 0);
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
    }

    @Test
    public void test08167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08167");
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
        // The following exception was thrown during execution in test generation
        try {
            int int63 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test08168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08168");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test08169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08169");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) ' ', (int) ' ', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) ' ', 32, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test08170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08170");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) -1, (int) (short) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 100, 32);
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
    public void test08171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08171");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) -1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (byte) 1, (int) (byte) 0);
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
    public void test08172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08172");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) 100, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) (short) -1, 0, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 52, (int) (short) 100, (-1), (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (byte) 10, (-1), 10);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test08173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08173");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 35, 0, 1);
        int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), (int) '#', (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 10 + "'", int37 == 10);
    }

    @Test
    public void test08174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08174");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 100, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', (int) (short) 1);
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
    public void test08175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08175");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 32, (-1), (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (int) (byte) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int55 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08176");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, 52, 0, 32);
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
    public void test08177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08177");
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
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) ' ', 0, (int) '#');
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
    public void test08178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08178");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) (short) 10, 1, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08179");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) -1, 1, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, 52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test08180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08180");
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
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, 52);
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
    public void test08181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08181");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 0, (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 100, (int) (short) -1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (byte) 100, 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (byte) -1, (int) (byte) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08182");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (-1), 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 1, (int) (short) 100, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 10, (int) (byte) 10, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08183");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) (byte) 10, 100, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 52, 0, (-1), 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (byte) 100, (int) (byte) 10, 100);
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test08184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08184");
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
        // The following exception was thrown during execution in test generation
        try {
            int int74 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) '#', 52);
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
    public void test08185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08185");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 0, 0, (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08186");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (-1), 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, 0, (int) 'a');
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
    public void test08187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08187");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 0, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 100, 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, (int) (short) -1);
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
    public void test08188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08188");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 1, 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 1, 52, (int) (byte) 10);
        int int71 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 10 + "'", int71 == 10);
    }

    @Test
    public void test08189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08189");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) -1, (int) 'a', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 1, (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) (byte) 100, (int) (short) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', (int) (short) 1, 52, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) (short) -1, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08190");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, 35, 1);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test08191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08191");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) '#', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, 0, (int) (short) 100);
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
    public void test08192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08192");
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
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) ' ');
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
    public void test08193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08193");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (byte) 100, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08194");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) (short) 100, 35);
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
    public void test08195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08195");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) 10, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 32, (int) (byte) -1, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08196");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 32, (int) (short) 100, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass50 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test08197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08197");
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
        int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', 0, 52);
        java.lang.Class<?> wildcardClass58 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 10 + "'", int52 == 10);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test08198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08198");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (short) 100, (int) '#', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 1, 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 52, 35, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08199");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 1, (int) (short) -1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08200");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 35, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) '4', (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 10);
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
    public void test08201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08201");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 10, (int) (byte) 100, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 32, (int) (short) -1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test08202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08202");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 10, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 1, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 100, 100, (-1));
        int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test08203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08203");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 0, 1);
        java.lang.Class<?> wildcardClass41 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test08204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08204");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 10, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (-1), (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08205");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 10, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 0, (-1), (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08206");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 32, 32, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 1, (int) (short) -1, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08207");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 100, 100, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 52, 1, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08208");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) -1, (int) ' ');
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
    public void test08209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08209");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (byte) 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, 0, (int) (byte) 0);
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
    public void test08210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08210");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) '4', (int) (short) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (int) ' ', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 0, 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test08211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08211");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) ' ', 32, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) (byte) 100, 52);
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
    public void test08212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08212");
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
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, (int) (short) 0);
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
    public void test08213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08213");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (short) 0, 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (-1), (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) -1, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) -1, (int) (short) 1, 52);
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
    public void test08214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08214");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 35, 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) '#', 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test08215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08215");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) -1, 1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (int) '#', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 35, (int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', 35, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test08216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08216");
        int[][] intArray0 = null;
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) (short) -1, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1);
    }

    @Test
    public void test08217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08217");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 1, 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (-1), (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) -1, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', (int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08218");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) -1, 100, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, 35);
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
    public void test08219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08219");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (short) 1, (int) (short) 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08220");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 1, 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) -1, (int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test08221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08221");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) -1, 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08222");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 100, (int) (byte) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08223");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 100, (int) '#', (int) (byte) 1);
        int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) '4', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) -1, (int) '#', (int) (byte) 100);
        java.lang.Class<?> wildcardClass57 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test08224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08224");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 10, 0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
    }

    @Test
    public void test08225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08225");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) 'a', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (byte) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08226");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, (int) (byte) -1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) 'a', 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (-1), (int) '4', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 100, (int) (short) 1, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test08227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08227");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) ' ', 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, 32, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test08228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08228");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) '#', 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (-1), (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 100, (int) (byte) 100, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test08229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08229");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (short) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) ' ', 52, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 1, 52);
        java.lang.Class<?> wildcardClass71 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test08230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08230");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 100, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 10, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 1, (int) 'a', (int) (byte) 0);
        int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass45 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test08231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08231");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) '4', (int) (short) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 0, (int) 'a', 35);
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
    public void test08232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08232");
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
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (byte) 1, (int) (byte) -1);
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
    public void test08233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08233");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) '#', 0);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) ' ');
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
    public void test08234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08234");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) -1, (int) (short) 100, (int) (short) -1);
        int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
    }

    @Test
    public void test08235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08235");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) -1, (-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', (int) (byte) -1, (int) (byte) 1);
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
    public void test08236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08236");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 10, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (-1), (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', 10, (int) (short) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) -1, 10);
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
    public void test08237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08237");
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
        java.lang.Class<?> wildcardClass50 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test08238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08238");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 0, (int) ' ', 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08239");
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
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 35, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test08240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08240");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) 'a', (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08241");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) -1, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, 35, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int66 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
    }

    @Test
    public void test08242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08242");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 0, 32, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, 10, 10);
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
    public void test08243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08243");
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
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[97, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
    }

    @Test
    public void test08244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08244");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 100, (int) '#', (int) (byte) 1);
        int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) '4', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 10, (int) (short) 0, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test08245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08245");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), (int) '#', (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 10, (-1), (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) ' ', (-1), (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 1, 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 0, (int) (short) 10);
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
    public void test08246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08246");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 100, 32, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 35, 32, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 100, (-1), 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 100, (int) (byte) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) 'a', (int) '4', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08247");
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
    public void test08248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08248");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 32, (int) (short) 100, 10);
        int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test08249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08249");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 1, (int) (byte) 100);
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
    public void test08250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08250");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, 10, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08251");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 100, (int) (byte) 0, 100);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) '#', (int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 100);
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
    public void test08252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08252");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) -1, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08253");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) ' ', 10, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test08254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08254");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 1, 32, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) -1, 100, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, 0, 35);
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
    public void test08255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08255");
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
        java.lang.Class<?> wildcardClass61 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test08256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08256");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 52, (int) (short) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 0, 0, 10);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test08257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08257");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 10, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, 52);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test08258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08258");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (-1), 32, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, (int) (short) -1);
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
    public void test08259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08259");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, 35, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08260");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 0, 0, 52);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test08261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08261");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) 'a', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08262");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 1, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test08263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08263");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 100, (int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int69 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) (short) 0);
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
    public void test08264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08264");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) -1, (int) (byte) 0, 0);
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
    public void test08265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08265");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 1, 32, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 100, (int) (short) 100, 32);
        java.lang.Class<?> wildcardClass60 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test08266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08266");
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
        int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 1, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 0, (int) '4');
        java.lang.Class<?> wildcardClass64 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test08267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08267");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 1, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
    }

    @Test
    public void test08268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08268");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, 35, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 0, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, 10, (int) (byte) 10);
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
    public void test08269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08269");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (short) 0, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (short) 10, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, -1, 1, -1]");
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
    public void test08270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08270");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 1, (int) (byte) 100, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, (int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (-1));
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
    public void test08271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08271");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) (byte) 0);
        int int36 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test08272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08272");
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
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), 0);
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
    public void test08273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08273");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, 1, (int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08274");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 10, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 10, (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 32, 100, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08275");
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
        java.lang.Class<?> wildcardClass46 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test08276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08276");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) -1, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) (byte) 1);
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
    public void test08277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08277");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) (short) 10, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 100, (int) (short) 0, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08278");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 0, (int) ' ', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) -1, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass75 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test08279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08279");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, 10, 35, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) 10, 52, 52);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test08280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08280");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 0, 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 52, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) '#', (int) ' ', (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08281");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 10, (int) '4', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) '#', (int) (short) 100, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test08282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08282");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), (int) '#', (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 0, 32, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '4', (int) (short) -1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', 32, 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) '#', (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 52, (int) (short) 1);
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
    public void test08283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08283");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '#', (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 10, (int) 'a', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) 1);
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
    public void test08284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08284");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (byte) 0, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 0, 32, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 100, 0, 0);
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
    public void test08285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08285");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) ' ', (int) '#', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) ' ', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 0, (int) (short) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test08286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08286");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) '#', (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) '4', 100, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, 52, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (-1), (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 1, (int) (byte) 0, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08287");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (int) ' ', (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) ' ');
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
    public void test08288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08288");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 52, (int) '4', 0);
        int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) ' ', 10, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
    }

    @Test
    public void test08289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08289");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, 35, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 52, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, 52);
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
    public void test08290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08290");
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
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 35);
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
    public void test08291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08291");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 100, (int) '#', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 35, (int) (short) -1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) ' ', (int) (short) 0, (int) (byte) 100);
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
    public void test08292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08292");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 100, 10, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test08293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08293");
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
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 0, (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 35);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test08294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08294");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) (short) -1, 100);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test08295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08295");
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
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) 'a');
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
    public void test08296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08296");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) -1, 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) (byte) 10, (int) (short) 100);
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
    public void test08297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08297");
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
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) (byte) -1);
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
    public void test08298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08298");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 100, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) -1, 0, 52);
        java.lang.Class<?> wildcardClass59 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test08299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08299");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 100, (int) (byte) 1, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 0, (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 100, 0, 0);
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
    public void test08300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08300");
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
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) '4');
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
    public void test08301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08301");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) '4');
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
    public void test08302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08302");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 0, (int) (byte) 100, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 52, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 35, 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) (byte) 10, (int) (byte) -1);
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
    public void test08303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08303");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 0, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) '#', 0);
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
    public void test08304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08304");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 100, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 100, (int) ' ');
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
    public void test08305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08305");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (byte) 1, (int) (byte) 0, 0);
        int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 35 + "'", int47 == 35);
    }

    @Test
    public void test08306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08306");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 1, 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (-1), (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) -1, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (int) (short) 0, (int) (byte) 1);
        int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass58 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test08307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08307");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '4', (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test08308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08308");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (short) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) ' ', 52, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) -1, 1, (int) ' ');
        java.lang.Class<?> wildcardClass72 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test08309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08309");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) ' ', 0, 1);
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
    public void test08310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08310");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), 32, (int) 'a');
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
    public void test08311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08311");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) -1, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, 0, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) (short) -1, (int) (short) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, (int) (byte) 100, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) 'a', (int) (byte) 100, (-1));
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
    public void test08312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08312");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 35, 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 0, (int) ' ');
        java.lang.Class<?> wildcardClass38 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test08313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08313");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 52, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 52, (int) (byte) -1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 1, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) -1, (int) (short) -1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08314");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 0, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test08315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08315");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, 1, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (short) 1, (int) (short) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) ' ', (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test08316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08316");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) 'a', (int) ' ');
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
    public void test08317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08317");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 32, 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) '4', (int) (byte) 100);
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
    public void test08318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08318");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 10, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 10, 35, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 10, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, 10);
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
    public void test08319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08319");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, 35, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 52, (int) (byte) 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, (int) '#');
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
    public void test08320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08320");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '4', (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test08321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08321");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) 'a', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (short) 100);
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
    public void test08322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08322");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) '#', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 1, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) -1, 35);
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
    public void test08323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08323");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) -1, (int) (byte) 100, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test08324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08324");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, 0, 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) (short) -1, (int) '4', 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 100, (int) '4', (int) (byte) 1);
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
    public void test08325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08325");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), (int) '#', (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 0, 32, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, 35, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 32, (int) (short) 10);
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
    public void test08326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08326");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 32, 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) (short) 0, 52);
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
    public void test08327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08327");
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
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test08328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08328");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (int) (byte) 100, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 0, 35, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test08329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08329");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 100, (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test08330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08330");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 100, (int) (short) 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) -1, 0, 52);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08331");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 0, 10);
        java.lang.Class<?> wildcardClass71 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test08332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08332");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 10, 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test08333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08333");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) -1, 52, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 0, 0, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08334");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) 'a', (int) '4', 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) (byte) 1, (-1), (int) (short) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) (short) 100, (int) (byte) 10, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) ' ', (int) (short) 0, (int) ' ', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) (short) 1, 52, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray4, 0, (int) (short) -1);
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
    public void test08335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08335");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) (short) 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) '#', 0);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test08336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08336");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, 32, (int) (short) 10);
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
    public void test08337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08337");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test08338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08338");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 100, 0, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08339");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (-1), (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) ' ', (int) '4', (int) '#');
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
    public void test08340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08340");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (-1), (int) 'a', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 0, (int) (byte) 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 1, 100, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08341");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) -1, (int) (short) 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 52, (int) '4', 0);
        int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass55 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test08342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08342");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (byte) 10, 52, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08343");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) -1, 52, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 10, (-1));
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
    public void test08344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08344");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 0, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) (short) 10);
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
    public void test08345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08345");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 10, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) '4', (int) '4', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) 0, 100, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 100, (int) (byte) 10, (int) (byte) -1);
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
    public void test08346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08346");
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
        int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
    }

    @Test
    public void test08347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08347");
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
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, 0);
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
    public void test08348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08348");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', 32, (int) '#', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 32, 32, (int) (short) 0);
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
    public void test08349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08349");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 100, (int) '4', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) -1, (int) (byte) 100, (int) '#');
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
    public void test08350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08350");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 10, (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, (int) (byte) 10, 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 32, (int) (short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 10, (int) (short) 100);
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
    public void test08351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08351");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 10, 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) 'a', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (-1), 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 1, (int) (byte) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08352");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, 52, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) 'a', (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (byte) 0, (int) (byte) 0);
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
    public void test08353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08353");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 0, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 10, (int) (byte) 100, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 32, (int) (short) -1, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test08354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08354");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) ' ', 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 32);
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
    public void test08355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08355");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) '#', (int) (short) 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) '4', 100, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, 52, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (-1), (int) (short) 100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass60 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test08356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08356");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (-1), 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) ' ', (int) (byte) -1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 100, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 100, 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 100, (int) (short) 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 35, (int) ' ', 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test08357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08357");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) ' ', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test08358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08358");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 32, 10, (int) (byte) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, 32, (int) '4', (int) 'a');
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
    }

    @Test
    public void test08359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08359");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 10, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (byte) 1, (int) ' ', (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 100, (int) (byte) 100, (int) (byte) 10);
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
    public void test08360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08360");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) ' ', (int) (short) 100, (int) ' ');
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
    public void test08361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08361");
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
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) ' ');
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
    public void test08362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08362");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (byte) 0, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (byte) 100, (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 0, (int) (byte) 1, 35);
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
    public void test08363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08363");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) ' ', 52);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test08364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08364");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '4', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 32, 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 10, 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 0, 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08365");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 1, 35, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', 52, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) (short) 0, 0);
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
    public void test08366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08366");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 0, (int) '4', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) (byte) 100, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 52, 52, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 1, (int) ' ', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (-1), 0);
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test08367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08367");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) '4', (int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass70 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test08368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08368");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, 0, 52);
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
    public void test08369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08369");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test08370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08370");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 10, (int) (short) 10);
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
    public void test08371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08371");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (-1), (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 1, 32, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) (byte) 1, 100);
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
    public void test08372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08372");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 1, 32, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) (short) -1);
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
    public void test08373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08373");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 100, (int) (short) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) ' ', (int) (short) 10);
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
    public void test08374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08374");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 100, (int) '4', (-1));
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test08375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08375");
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
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 10);
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
    public void test08376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08376");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 0, (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', (int) '#', 1);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test08377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08377");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 100, 52, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) 'a', 52, (int) (short) -1);
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
    public void test08378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08378");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 100, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 1, 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (-1), (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) -1, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (int) (short) 0, (int) (byte) 1);
        int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 0, (int) (short) 10, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test08379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08379");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 10, 32, (int) '#', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (-1), (int) (short) 0, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 1, (-1), (int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass66 = intArray30.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test08380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08380");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 100, (int) '4', (int) (byte) -1);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08381");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, 35, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 52, (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) 'a', (int) (byte) 10, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test08382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08382");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '4', (int) '4', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 0, (int) '4', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test08383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08383");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) 0, 52, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 1, (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 1, (int) (short) 10, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08384");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (-1), 10, 1);
        java.lang.Class<?> wildcardClass59 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test08385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08385");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 0, 100, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 1, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 32, (-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) ' ');
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
    public void test08386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08386");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 100, (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (-1), 35, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08387");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 1, (int) '#', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, (int) (short) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) (byte) 100, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 10, (-1), 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test08388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08388");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 100, (int) (byte) 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) (short) 100, (int) (byte) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 10, (int) '4', (int) (short) 1);
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
    public void test08389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08389");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', (int) (byte) 1, (int) (byte) 10, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (short) 100, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test08390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08390");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) -1, (int) 'a', 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 52, (int) ' ');
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
    public void test08391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08391");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 10, 0, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08392");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 0, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) 'a', (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass66 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test08393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08393");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 100, 1, 0);
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
    public void test08394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08394");
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
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 1);
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test08395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08395");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '4', (int) '4', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 0, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test08396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08396");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), (int) '#', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test08397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08397");
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
        int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test08398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08398");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 100, (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', (int) (short) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass56 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test08399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08399");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 32, 32, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, (int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08400");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 10, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (int) (short) 1, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (short) 1, 0);
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
    public void test08401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08401");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) '4', (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (short) 10, (-1));
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
    public void test08402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08402");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) -1, (int) (short) -1, 10);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test08403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08403");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 100, 32, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test08404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08404");
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
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (int) (short) 0);
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
    public void test08405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08405");
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
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) '4');
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
    public void test08406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08406");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (-1), (int) (short) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int63 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 10);
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
    public void test08407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08407");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 100);
        int int76 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int79 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
    }

    @Test
    public void test08408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08408");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 100, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), (int) (short) 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) ' ', (int) (short) 10);
        int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
    }

    @Test
    public void test08409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08409");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '4', (int) '4', 10);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, (int) (short) 0, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 100, (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test08410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08410");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, 35, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 35, (int) (byte) 10, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (byte) 10);
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
    public void test08411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08411");
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
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test08412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08412");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08413");
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
        int int63 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 10 + "'", int63 == 10);
    }

    @Test
    public void test08414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08414");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 10, (int) '4', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) '#', (int) (short) 100, 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) -1, 52, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 100);
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
    public void test08415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08415");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 35, 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 10, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test08416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08416");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 10, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) '4', (int) '4', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 1, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (-1), (int) (short) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 0, (int) (short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 10, (int) '4');
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
    public void test08417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08417");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (short) -1, 32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08418");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 35, (int) (byte) 10, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (byte) -1, 35);
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
    public void test08419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08419");
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
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 100, (int) (short) 10);
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
    public void test08420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08420");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), 100, 32);
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
    public void test08421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08421");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) '#', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (int) ' ', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 32, (int) (byte) -1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (-1), (int) (byte) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) -1, (int) (byte) -1);
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
    public void test08422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08422");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) 0, 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) (short) 100, 10);
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
    public void test08423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08423");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', (int) (short) 1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 52, 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08424");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 10, 100, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 32, 32, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, 100);
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
    public void test08425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08425");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 52, (int) (short) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 0, (int) 'a', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, 1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08426");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) -1, (int) (short) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) (byte) -1);
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
    public void test08427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08427");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (byte) 0, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 0, 32, (int) 'a');
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test08428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08428");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 0, (int) ' ', 100);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test08429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08429");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) ' ', (int) (byte) 1, 0);
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
    public void test08430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08430");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 0, 10, 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) 'a', 35, (int) '#', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (byte) 100, (int) (byte) -1, (int) (short) 10);
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
    public void test08431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08431");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, (int) (short) 0, (int) (short) -1);
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
    public void test08432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08432");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', 10, 100);
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
    public void test08433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08433");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (int) (byte) 100, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 0, 35, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) -1, (int) (byte) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass40 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test08434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08434");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (short) -1, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08435");
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
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) '#');
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
    public void test08436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08436");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, (int) 'a', 52);
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', (int) '#');
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
    public void test08437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08437");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 0, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 52, 100, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 1, (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, (int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08438");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 10, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) '#', (int) (byte) 10);
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
    public void test08439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08439");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (int) (short) 100, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 52, (int) '4', (int) (short) 100, 35);
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
    public void test08440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08440");
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
        int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 10, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test08441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08441");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 100, (int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 100, 52);
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
    public void test08442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08442");
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
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, 10);
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
    public void test08443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08443");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (short) 1, 35, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (-1), (int) 'a', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 0, 0, 35);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08444");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 52, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test08445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08445");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, 35, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 52, 0, (int) '#');
        java.lang.Class<?> wildcardClass34 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test08446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08446");
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
        java.lang.Class<?> wildcardClass57 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test08447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08447");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 1, 52);
        java.lang.Class<?> wildcardClass31 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test08448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08448");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, 1, (int) (short) 1);
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
    public void test08449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08449");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test08450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08450");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) -1, (int) (short) 100, (int) (short) -1);
        int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 10, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (int) (short) 1);
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
    public void test08451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08451");
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
        java.lang.Class<?> wildcardClass60 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test08452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08452");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) 'a', (int) '4', 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, 32, (int) (short) -1, (int) (short) 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, 0, (int) '#', (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray4, 10, (int) (byte) 0, (int) (short) 100);
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
    public void test08453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08453");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) 10, (int) (byte) 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 100);
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
    public void test08454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08454");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 0, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08455");
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
        int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (short) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 100, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) 'a', 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test08456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08456");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 10, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (-1), (int) (byte) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) (byte) 0);
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
    public void test08457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08457");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 32, (int) (byte) 0, (int) '#');
        java.lang.Class<?> wildcardClass56 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test08458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08458");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 100, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 10, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 1, (int) 'a', (int) (byte) 0);
        int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 10 + "'", int44 == 10);
    }

    @Test
    public void test08459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08459");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) -1, (int) (short) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, 0, (int) (byte) 10, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (byte) -1, (int) (byte) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (-1), 10);
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
    public void test08460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08460");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, (int) (short) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08461");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 35, (int) ' ', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (-1), (int) (short) 10, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 10, (-1), (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (-1), (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', (int) (short) 100);
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
    public void test08462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08462");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (-1), (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08463");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) (byte) -1, 0);
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
    public void test08464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08464");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 100, (int) ' ', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 100, (int) (byte) 1);
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
    public void test08465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08465");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) -1, (int) (byte) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 100, (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 35, (int) (byte) 100, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (-1));
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
    public void test08466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08466");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 1, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08467");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) '#', (-1));
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
    public void test08468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08468");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 100, (int) (short) 1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', 0, 32, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) '4', (int) '4', (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08469");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 100, (int) (byte) -1, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', (int) (short) 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 100, (int) (short) -1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08470");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (byte) 10, (int) (short) 100, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08471");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 1, 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 10, (int) (short) -1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 0, (int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test08472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08472");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 35, (int) ' ', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (-1), (int) (short) 10, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) ' ', (int) (byte) 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, (int) (short) 100, 32);
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
    public void test08473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08473");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 10, (int) (byte) 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (-1), (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 0, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08474");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (short) 1, (int) (byte) 10);
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
    public void test08475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08475");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 1, (int) '#', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) '4', 32, (int) (short) 1);
        java.lang.Class<?> wildcardClass64 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test08476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08476");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, 0, (int) (byte) 10);
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
    public void test08477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08477");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 10, (int) (short) -1);
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
    public void test08478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08478");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 32, 35, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, 32, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test08479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08479");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 100, (int) (short) 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 35, (int) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08480");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) ' ', (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) -1, 52, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 0, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) (byte) 1);
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
    public void test08481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08481");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '4', (int) (byte) 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, (int) (byte) 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 10, (int) (short) -1, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 32 + "'", int56 == 32);
    }

    @Test
    public void test08482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08482");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '4', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 32, 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (int) (byte) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test08483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08483");
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
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, 52);
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
    public void test08484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08484");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 100, (-1), (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 100, (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '4', (int) '#', 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08485");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) 'a', 0, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int63 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 52, (int) (short) 1);
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
    public void test08486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08486");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 1, (int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) (byte) 0);
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
    public void test08487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08487");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 35, (int) (short) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test08488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08488");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) 'a', (int) '4', 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, 1, (int) (byte) 10, 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, 52, 35, 0, (-1));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test08489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08489");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, (int) (byte) 0);
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
    public void test08490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08490");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 100, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 100, 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 10 + "'", int39 == 10);
    }

    @Test
    public void test08491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08491");
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
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 35);
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
    public void test08492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08492");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '4', (int) (short) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) ' ', 52, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 100, 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 1, 52);
        int int73 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, 32, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 52]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 10 + "'", int73 == 10);
    }

    @Test
    public void test08493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08493");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 100, 52, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test08494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08494");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 32, (int) ' ', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (-1), 0);
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
    public void test08495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08495");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) ' ', (int) (byte) 100, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test08496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08496");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (-1), 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 100, (int) ' ', 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test08497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08497");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) '#', (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 32, (int) (byte) -1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) '4', (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) (short) -1);
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
    public void test08498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08498");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 100, (int) (byte) -1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (int) 'a', 32);
        java.lang.Class<?> wildcardClass43 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test08499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08499");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (-1), (int) (short) -1, (-1));
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test08500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test08500");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) 10, (-1), 32);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', (int) (short) -1);
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
}

