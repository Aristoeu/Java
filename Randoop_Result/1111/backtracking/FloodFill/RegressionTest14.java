package backtracking.FloodFill;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 1, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
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
        // The following exception was thrown during execution in test generation
        try {
            int int55 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) -1, (int) (byte) 10);
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
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) -1, 0, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '4', (-1), 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) 100, (int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, 52);
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
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (short) 0, (int) (byte) 0);
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
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 1, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 10, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) (short) -1, 10);
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
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, (int) ' ', (int) 'a', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) (byte) 1, 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, 0, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 52, (int) (byte) -1, (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 0, (int) (byte) 0, 100);
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
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
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
        int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) -1, (int) (short) 10, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) ' ');
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
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, 100, (int) (short) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
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
        int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) -1, 1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, (int) '#', (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
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
        int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 10 + "'", int67 == 10);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) '#', 52, (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 0, (int) (byte) 100, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, (int) '#', (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass53 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 10);
        java.lang.Class<?> wildcardClass39 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 10, (int) (short) 0);
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
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 100, (int) ' ', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 10);
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
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) (short) 0, 100);
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
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
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
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) 'a', (int) ' ');
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
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, 100, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 100, (-1), (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 100, (int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) -1, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 0, 100, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 100, (int) '#', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) 'a', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, (int) '4', 0);
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
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) (short) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 10, (int) (short) 0, 52);
        int int72 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 35 + "'", int72 == 35);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), 35, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (-1), 0);
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
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
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
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 0, (int) (short) 1);
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
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 10, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', (int) (byte) 100, (-1));
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
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '#', (int) (byte) 100, (int) (short) 1);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 100, 1);
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
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 35, (int) (byte) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, 0);
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
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) '#', (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
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
        java.lang.Class<?> wildcardClass51 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (-1));
        int int31 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 1, (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 1, (int) (byte) 10, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 0, (-1), 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, 0, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (short) 1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (byte) 100, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) ' ', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 10, (int) ' ', (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) '#', 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (-1), (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 100, (int) (byte) 100, 52);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), 35, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 0, (int) (short) 1, 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 100, (int) '4', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 0, (int) (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
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
        // The following exception was thrown during execution in test generation
        try {
            int int56 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) 1);
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
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
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
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (byte) 10);
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
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 10, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 1, (int) 'a');
        java.lang.Class<?> wildcardClass36 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        int[] intArray1 = new int[] { 0 };
        int[] intArray3 = new int[] { 0 };
        int[][] intArray4 = new int[][] { intArray1, intArray3 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, (int) 'a', (int) '4', 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, 32, (int) (short) -1, (int) (short) 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray4, 0, (int) '#', (int) ' ', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray4, (int) (byte) 0, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
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
        int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', 52, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
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
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, 52);
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
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) (byte) 1, 10);
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
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 100, (int) '#', (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) ' ', (int) (byte) 1, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 52, 10, 52);
        java.lang.Class<?> wildcardClass57 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 32, (int) (short) -1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 52, (int) (byte) 10, 32);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (-1), 100);
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
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (-1), 35, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 10, (int) '4', (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
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
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) (byte) 1);
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
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
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
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) (byte) 1);
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
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 10, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (short) 10, (-1), (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, 100, (int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 10, (int) (byte) 10, (int) (short) 0);
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
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
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
        java.lang.Class<?> wildcardClass38 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (-1), (int) (short) 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 100, (int) ' ');
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
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 1);
        int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 52, (int) (short) -1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, 35, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, 0);
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
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
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
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) 100);
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
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (-1), 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (-1), (int) 'a', (int) (short) 100);
        java.lang.Class<?> wildcardClass77 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) -1, (int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) (byte) 1);
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
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) ' ', (int) (byte) 100, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 0, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 10, 35, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 52, (int) (byte) 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 10, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, 52, (int) '#');
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
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
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
        int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 10, (int) (byte) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (int) ' ', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 10, 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
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
        int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, (int) 'a', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 10, 32, (int) (short) -1);
        int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (short) 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (byte) 1, (int) ' ', (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (short) -1, 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) ' ', 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) -1, (int) '4', (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) -1, (int) 'a', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) 0, (int) '#', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', 10, (int) (short) 1);
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
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
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
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 100);
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
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
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
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) (byte) 100);
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
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) -1, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, 52, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) '4', (int) (short) 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 0, (-1));
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
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 32, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass66 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', 1, (int) (short) 0);
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
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, (int) (byte) -1, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 0, 32, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) -1);
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
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 10, 35, 0);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 0, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, (int) ' ');
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
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 0, (int) 'a', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (-1), (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) '#', (int) 'a', (int) ' ');
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
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (byte) 100, (int) (byte) 10);
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
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 35, (int) (byte) -1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) ' ', (int) (short) -1);
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
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (short) 0, 0);
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
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (-1), (int) '4');
        java.lang.Class<?> wildcardClass65 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) 'a', (int) (byte) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 100, 52, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 1, (int) (short) -1, (int) (short) 1);
        int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) ' ', (int) (byte) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) 0, 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 1, (int) '#', (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 10, (int) (byte) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, 32, (int) (short) 0);
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
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
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
        java.lang.Class<?> wildcardClass51 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 10, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) '4', (int) '4', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 10, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 10, (int) (short) -1);
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
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) '#', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) ' ', 52, 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, 35);
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
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 10, 32, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 1, (int) (byte) 1, (int) (byte) 0);
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
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        int[][] intArray0 = null;
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) (short) -1, (int) '4', 1, 1);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) 'a', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
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
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (byte) 10);
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
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) -1, 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 1, 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, 35);
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
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 0, (int) ' ', 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 0, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, 100);
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
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) -1, (int) (short) -1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) -1, (int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) (byte) 1);
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
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 32, 35, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 35, (int) (short) -1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) -1, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 100, (int) (short) 1, 32);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, 0, 0);
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
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) -1, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) '4', (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, (int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, 0, (int) (short) 0);
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
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
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
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', 10);
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
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
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
        java.lang.Class<?> wildcardClass38 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 32, 35, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) '4', 35, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) '#', (int) (short) 100, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 1, (int) 'a', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) -1, (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 1, 52, (int) (byte) -1);
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
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 100, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) (short) -1, 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', 1, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 100, (int) 'a');
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
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (-1), (int) (short) 100);
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
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 32, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 0, (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass55 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 100, 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 0, 100, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 10);
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
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) '#', 35);
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
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) 'a', 0);
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
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 52, 10, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, 0, (int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass48 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 100, 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 52, (int) (short) 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) '#', (int) (short) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (byte) 1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 1, 100, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 0, (int) (short) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', (int) ' ');
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
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) (byte) 0, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 10, 35, 52);
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (int) (short) 10, (int) (short) -1);
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
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 10, (int) (byte) -1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) '4', (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) 'a');
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
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
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
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 0, (int) '#');
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
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
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
        int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 100, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (byte) 1, 0);
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
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) -1, 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) -1, (int) '#', 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (-1), 0);
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
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) -1, 1, (int) (short) 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (short) 100, (int) (short) 1, 1);
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
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 0, (int) (short) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 100, 35, (int) (short) 100);
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
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 0, 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 1, 32, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, 100, 52);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 100, 100, 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 0, (int) '4', (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 0, 100, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) '#', 32, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) (short) 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) 'a', 35, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
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
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) 'a');
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
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 100, (int) (byte) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) 'a', (int) (byte) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) ' ', (int) (byte) -1);
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
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 100, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, (int) (short) 1);
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
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '#', (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, 0);
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
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 100, (int) (byte) 10, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (byte) 0, 32, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) 'a', (int) (short) -1);
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
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 0, 35, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) (byte) 10, 52);
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
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) '#', (int) (short) 100);
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
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 0, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (-1), (int) (byte) 0, (int) (short) 10);
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
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 100, 52, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 0, (int) (short) 100, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) -1, 35, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
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
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 35);
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
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 1, (int) (short) 1, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, 52, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) '4', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 1, (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 35, 52, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) -1);
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
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 1, (int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (byte) 100, 10);
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
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 100, 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) -1, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 100, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 52, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 0, (int) (short) 0, (int) '#');
        int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) (short) 1, 32, 52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 0, (-1), (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 10);
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
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
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
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, 32);
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
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 100 + "'", int76 == 100);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (byte) 0, (int) (short) 100, (int) (short) 10);
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
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 100, (int) (byte) -1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, (int) 'a', 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) '#', (int) ' ');
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
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
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
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) '4');
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
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
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
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, (int) '#');
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
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, 100, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, 32, 52);
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
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) -1, (int) (short) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, 0, 10);
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
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (int) (short) 0, 32);
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
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 52, (-1));
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
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (-1), 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 10, (-1), (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, (int) (short) 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 52, (-1), (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 0, (int) (short) -1, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
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
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 0, (int) (byte) 10);
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
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 1, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, (int) (byte) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (int) '#', 35);
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
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
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
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) '#');
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
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', 100, 0);
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
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
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
        java.lang.Class<?> wildcardClass46 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) -1, 52, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int63 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, (int) (byte) 0);
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
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) 'a', (int) '4', (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, 10, (int) (short) 100, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        int[] intArray5 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray17 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray23 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[] intArray29 = new int[] { (byte) 100, '#', (-1), (byte) 1, (-1) };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 100, (int) '4', 100, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (-1), 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, (int) '4', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 100, (int) '#', 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 0, (int) (byte) -1, (int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 52, 100);
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
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) '#', (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 10, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 1, (int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 52, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 10 + "'", int53 == 10);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) (short) -1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 10, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 0, (int) (byte) 100, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, (int) (byte) -1, (int) (byte) 1);
        int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, 10, (int) (byte) 0);
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
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 0, 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 52, (int) (short) 0, (-1));
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
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 10, 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) (short) 0);
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
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
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
        // The following exception was thrown during execution in test generation
        try {
            int int67 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), 100);
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
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
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
        java.lang.Class<?> wildcardClass45 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) -1, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) -1, (int) (byte) 0, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 32, 35, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) ' ', 0);
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
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 0, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (short) 0, (int) 'a');
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
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', 32, (int) '#', (int) '4');
        java.lang.Class<?> wildcardClass28 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 0, (int) '#', 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (byte) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) (short) 100);
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
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, (int) '#', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 10, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 32, 52, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) '#');
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
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 32, (int) ' ', (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', (int) (byte) 100, (int) ' ');
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
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) -1, (int) 'a', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) ' ', 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', 0, (int) 'a');
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
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 10, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) '4', (int) '4', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 10, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (byte) -1, (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass38 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
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
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) '#', (int) '4');
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
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
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
        java.lang.Class<?> wildcardClass40 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (short) 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 32, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, 100, (int) ' ');
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
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
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
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) -1);
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
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 35, 35, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 10, 32, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 100, (int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) -1, (int) 'a', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) 0, (int) '#', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 32, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int68 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, 100);
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
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
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
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, 0);
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
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
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
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 32);
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
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 10, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 1, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', (int) (short) 100);
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
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (byte) 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 35, 52, (int) (short) 100);
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, (int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 32, (int) 'a');
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
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (-1), 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, 0, (int) (byte) 0);
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
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 10, (int) (byte) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) '4');
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
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 52, (int) ' ', (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
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
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
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
        int int43 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) '#', 35, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 10 + "'", int43 == 10);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 0, 32, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', 1);
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
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) '4', (int) (short) 10, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, (int) (byte) 10, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) (byte) 0, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 10, 100);
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
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, 35, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 0, 35, 52);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 0, (int) 'a', 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 100, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (-1));
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
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 100, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) (short) -1, 100, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', 1, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 0, (int) (short) 1);
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
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) -1, (int) (short) -1, 1);
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
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
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', (int) (short) 100);
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
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 10, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 100, (int) (byte) 10, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) '#', (int) (short) 1);
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
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) '4', 52, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 100, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, (int) 'a');
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
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
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
        java.lang.Class<?> wildcardClass55 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) (byte) 10, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) '#', 32);
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
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 35, (int) ' ', (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, (int) (byte) 100, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) ' ', 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, (int) (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '#', (-1));
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
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 1, 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) (byte) 10, 100, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, 10, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (short) 1, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 100, 0, (int) (byte) 1);
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
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 0, (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 100, (int) (short) -1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 0, (int) (byte) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (short) 10, 100);
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
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) '#', 100, (int) (byte) 1);
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
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) (byte) 10, 100, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) '#', 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 0, (int) '4', 0);
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
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 0, (int) (short) 10, (-1));
        int int46 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), 0, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, 100, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) '4');
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
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) '4', (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
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
        int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) (short) 100);
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
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, 0, 35);
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
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 1, (int) '4', 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
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
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 52);
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
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (-1), (int) (short) 100, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (byte) 1);
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
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, (int) ' ', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 32]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
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
        // The following exception was thrown during execution in test generation
        try {
            int int57 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', (int) (short) 100);
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
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 10, (int) ' ', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', (int) (short) 0);
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
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) '#', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 35, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 32, (int) (byte) 0);
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
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) (short) -1, (int) (short) 10);
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
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', 0, (int) '4', 0);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
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
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) ' ');
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
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) (short) 100, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) (byte) 100, (-1));
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
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 32, (int) '4');
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
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
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
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (short) 1);
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
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
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
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 1, 35, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 1, (int) 'a', (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
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
        int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 1, 35, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (int) ' ');
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
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 100, (int) (byte) 0);
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
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 1, 32, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 100);
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
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) '#', 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) (byte) 10, (int) (byte) 100);
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
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) 'a', (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (byte) 0, 32, (int) (short) 100);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
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
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (short) 0);
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
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (short) 100, (int) (short) 100);
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
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 100, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 0, 32, (int) (byte) 0);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 10, (int) ' ', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 100, (int) (byte) 100, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 0, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 35, 1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 10, (int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, (-1), (int) (byte) 1);
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
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) ' ', (int) (short) -1, (int) (byte) 10);
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
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, 32, (int) (byte) 1);
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
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) -1, (-1), 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 1, (int) (short) 1, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 10, 35, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 0, (int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 0, 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 1, (int) (byte) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) -1);
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
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (-1), (int) '#', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, (int) '#', (int) ' ');
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
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 32, (int) (short) -1, (int) (byte) 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 0, (int) (short) 10, (int) (byte) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int88 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
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
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (int) 'a');
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
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, 0, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) -1, (int) (short) 0, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '4', (int) (short) 100, 10);
        java.lang.Class<?> wildcardClass62 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
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
        int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int50 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 10 + "'", int47 == 10);
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', (int) (byte) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) '4', 35);
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
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), 35, (int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass80 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
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
        int int70 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 1, (int) (short) 10, 0);
        java.lang.Class<?> wildcardClass76 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 10 + "'", int62 == 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 35 + "'", int70 == 35);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
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
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 100, (int) (byte) 1);
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
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 100, (int) (byte) -1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (-1), (int) (byte) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 10, 35, (-1));
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
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
        java.lang.Class<?> wildcardClass59 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (-1), (int) (short) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
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
        int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 10, 100, (int) '4');
        int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) '#', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 35, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 1, 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass45 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 100, (int) (short) 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 10, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) '4', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 100);
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
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
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
        // The following exception was thrown during execution in test generation
        try {
            int int54 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, 52);
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
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (byte) 0, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) '#');
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
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
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
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (byte) 100);
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
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (short) 1, (int) '4');
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
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), 35, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) '#', (int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', (-1));
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
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (short) -1, (int) (short) 10);
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
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) ' ', (int) (short) 1, (int) (byte) 0);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 0, (int) (short) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, 35, 10);
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
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
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
            int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) 100);
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
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) ' ', (int) (short) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 32);
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
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
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
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (short) 10);
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
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 1, (int) 'a', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (short) -1, (-1), 52);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 1, (int) (short) -1);
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
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) -1, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) '4', (int) (short) 100, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (byte) 10, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, (int) 'a', 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
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
        java.lang.Class<?> wildcardClass56 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 1, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (short) -1, (int) (short) 1);
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
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 0, (int) '4', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, 35, (int) (short) 10);
        java.lang.Class<?> wildcardClass37 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, 0, (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) ' ', (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 10, (int) (short) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', 100, (int) 'a');
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
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, 52, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', (int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (byte) 10, 10, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 1, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 100, 100, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) ' ', (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 10, 32, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 10, (int) (byte) 1, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, 0, (int) 'a', 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', (int) (short) 1, (-1), (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 32, 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) '4');
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
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) -1, (int) '4', 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, (int) (byte) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '#', (int) (byte) 0, (int) (short) 10);
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
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
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
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
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
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (short) 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 10, (int) (short) 10, (int) (short) 100);
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
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) 'a', (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 35, (int) '4', 100);
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, 10);
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
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        int int27 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (short) 0, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) (short) 10, (int) (byte) 0);
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
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
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
        int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 100, 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 10 + "'", int64 == 10);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 1, (-1), 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 100, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass60 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, (int) (byte) 10, (int) '#');
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
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 0, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) '4');
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
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
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
        // The following exception was thrown during execution in test generation
        try {
            int int43 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) '4');
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
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
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
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) '4', 32);
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
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (short) 1, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, -1, 1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 0, -1, 1, -1]");
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
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (-1));
        int int31 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 52, 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 10, (int) (byte) 100, 1);
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
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', 35, (int) (byte) 1);
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
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) -1, (int) ' ', 10);
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
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
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
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (-1));
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
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) -1, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass72 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 32, (int) (byte) 10, 10);
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
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), (int) '#', (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 0, 32, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) '#', (int) (short) 100, (int) (short) 1);
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
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) (short) 0, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, (int) (short) 1, 32);
        java.lang.Class<?> wildcardClass48 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 1, (int) (byte) -1, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 32, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) '#', (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 32, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) ' ', 1, (-1));
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 1, 10);
        java.lang.Class<?> wildcardClass40 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (byte) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (-1), (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 10, (int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 35, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (byte) 0, 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, 1);
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
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 100, (-1), (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) -1, (int) (short) 10, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (byte) 1, 35, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass35 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (-1), (int) (short) 1, 100);
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        int int19 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) -1, 0);
        int int32 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 100, 52, (int) 'a');
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
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) -1, (int) 'a', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, (int) (short) 10, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 1, (int) (short) 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 1, (int) (byte) 100, 10);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (byte) 1, (int) (byte) 1, (int) '4');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', 35, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 10, (int) (short) 100, (int) (short) 1);
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
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), 10, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (short) 10, (-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 1, (int) (byte) 10);
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
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 52, (int) (byte) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, 100);
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
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 0, 100, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 32, (int) (byte) 1);
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
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) 100, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) (short) -1, 0, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) 1, (-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 0, 0);
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
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) 'a', (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) (byte) 10, (int) (byte) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (byte) 1, (int) (short) 1, 100);
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
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
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
        // The following exception was thrown during execution in test generation
        try {
            int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (short) 100);
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
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 10, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (-1), (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) 'a', 10, (int) (short) 10, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (short) 1, (int) 'a', (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 10, (int) (byte) 10, (int) (byte) 100);
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
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '4', 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', 35);
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
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) '#', (int) (byte) 100);
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
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 0, (int) (short) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (short) -1, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) -1, (int) '#');
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
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 10, (int) (short) 100);
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
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 1, 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, (int) (byte) 10, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int60 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 100, 0);
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
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', 10, (int) (short) 100);
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
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '#', (int) '#', 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 32, (int) (byte) 1, (int) (byte) 0, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (-1), (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) '4', 10, (int) 'a');
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
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 0, (int) (byte) 10, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) 100, (int) (byte) 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) (short) -1, 0, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 52, (int) (short) 100, (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) '4', (int) (short) -1, 0);
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
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) -1, (int) '4', 100);
        int int59 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) (short) 10, 32, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) '4', (int) ' ', (-1));
        java.lang.Class<?> wildcardClass70 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 10, (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 52, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) -1, (int) (byte) 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, (int) '#', (int) (short) 10, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 1, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', 32, (int) ' ');
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
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) (byte) 0, (int) (short) 10, 35);
        java.lang.Class<?> wildcardClass43 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) 'a', (int) (byte) -1, (int) (short) 100);
        int int29 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 10, (int) (byte) -1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 10, 10, 32);
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
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, (int) 'a', 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, (int) (byte) 1, 10, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) (byte) 100, (int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
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
        java.lang.Class<?> wildcardClass38 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
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
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
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
        // The following exception was thrown during execution in test generation
        try {
            int int53 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 52, (int) (byte) 1);
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
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, (int) (short) 10, (int) (byte) -1);
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
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) '#', (int) '#', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 35, (int) (byte) 0, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 0, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) '#', (int) (short) 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, 1);
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
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) '#', (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (short) 1, 35);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, 0, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 10, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', (int) (short) 10);
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
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) -1, (int) (byte) -1, (int) (byte) 100, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 1, (int) '4', (int) (short) 100, (int) 'a');
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
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) -1, (int) '4', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) '#', 10, (int) (short) 0);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, (int) (short) 0, (int) (short) 100);
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
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (short) 100, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, (int) ' ', (int) (short) 0);
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
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) -1, (int) (short) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 0, 1, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 0, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 0, 32, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 1, (int) (byte) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 10, 32, (int) 'a');
        java.lang.Class<?> wildcardClass42 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 10, (int) (byte) -1, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        int int24 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (byte) 100, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 35, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (-1), (int) (byte) -1, 0);
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
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) (short) 0, (int) (short) 100, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
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
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
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
        java.lang.Class<?> wildcardClass39 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, (int) 'a', (-1));
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
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (short) 1, (int) ' ', (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 32]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 100, (int) (short) 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 100, (-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 32, 1);
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
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
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
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) 'a');
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
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (-1), (int) ' ', (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (byte) 0, 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 32, 1);
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
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 1, (int) '4', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 0, (int) (short) 100, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 100, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '#', (int) (byte) 10, (-1), (int) ' ');
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
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) '4', 35, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (short) 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 32, (int) (short) 100, 10);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 52, 0, (int) (short) 100);
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
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
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
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, 1);
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
    public void test7400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7400");
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
            int int39 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test7401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7401");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (byte) 1, (int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass57 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 10 + "'", int42 == 10);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test7402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7402");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) -1, (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, 32, 10);
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
    public void test7403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7403");
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
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7404");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (short) -1, (int) '4', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) 'a', (int) '4', 35);
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
    public void test7405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7405");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 1, (int) ' ');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 10, (int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass32 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test7406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7406");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, 0, 32);
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
    public void test7407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7407");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 10, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 100, 35, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 10, (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 52, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) -1, (int) (byte) 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 0, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 52, (int) (byte) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, 0);
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
    public void test7408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7408");
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7409");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 1, (int) 'a', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, (int) (short) -1, (-1), 52);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) '#', 10);
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
    public void test7410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7410");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int85 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test7411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7411");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, (-1), (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (byte) 0, 32, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test7412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7412");
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
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) -1, (int) (byte) 100);
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
    public void test7413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7413");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 10, (int) ' ', 32);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, 0, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (short) 0, 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 32, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7414");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, (int) (short) 10, (int) (byte) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) '#', (int) ' ');
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
    public void test7415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7415");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 100, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 100, (int) (short) 0, (int) ' ', 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 0, (int) (short) 10, (int) (short) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 100, 10, 35, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (short) 1, 1, (int) '#');
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7416");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '#', (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (int) '#');
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
    public void test7417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7417");
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
            int int45 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (-1), (-1));
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
    public void test7418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7418");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test7419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7419");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) 'a', (int) ' ', (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7420");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', 32, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) (byte) -1);
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
    public void test7421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7421");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 35, 10, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7422");
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
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7423");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 100);
        int int23 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 35, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test7424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7424");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) '#', (int) '#', 0, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, (int) (byte) 1, 1, 35);
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
    public void test7425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7425");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (-1), (int) (byte) 10, 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 0, (int) (byte) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) ' ', 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 1, 35);
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
    public void test7426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7426");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, (int) (byte) 10, (int) (short) 100);
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
    public void test7427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7427");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (byte) 10, (int) (short) 1, 52);
        java.lang.Class<?> wildcardClass47 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test7428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7428");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 32, 35, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, (int) (short) -1, (int) (byte) 0, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 10, (int) (short) 100, (int) 'a');
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 32, (int) (short) 0, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
    }

    @Test
    public void test7429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7429");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) 'a', (int) (short) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (byte) 10, 100, (-1));
        java.lang.Class<?> wildcardClass33 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test7430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7430");
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
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) -1, 1);
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
    public void test7431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7431");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 1, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (-1), 52, 10);
        java.lang.Class<?> wildcardClass52 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test7432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7432");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, 0, (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) (byte) 100);
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
    public void test7433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7433");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) ' ', 52, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 100, (int) (short) 0, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7434");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) 0, 35, 10);
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
    public void test7435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7435");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 10, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) '4', (int) '4', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 10, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) '#', 35, 100);
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
    public void test7436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7436");
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
        int int66 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, 0);
        int int69 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test7437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7437");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', (int) '#', 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', 32, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 10, (int) 'a', 35);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 0);
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
    public void test7438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7438");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, 0, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7439");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, (int) (byte) 10, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7440");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, 0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test7441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7441");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (-1), (int) '#', (int) (byte) 1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, 10, (-1), (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) ' ', (-1), (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 1, 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7442");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 35, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) -1, 1, (int) ' ', 35);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray2, 52, 100);
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
    public void test7443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7443");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 0, (int) (byte) 10, (int) (short) 100, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, 10, (int) (byte) 1, (int) (short) -1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 0, (int) (short) 10, (int) (short) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 100, (int) (short) 10, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray30, (int) (byte) 10, (int) ' ', 0);
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
    public void test7444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7444");
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
        int int52 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) '#', (int) '4', (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
    }

    @Test
    public void test7445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7445");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 1, (int) (short) 10, 100);
        int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) '4', 100, (int) (short) 0);
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
    public void test7446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7446");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 0, (int) '#', (int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int94 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, 10, 100);
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
    public void test7447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7447");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (byte) 10, 10, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) 'a', 0, (-1));
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
    public void test7448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7448");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, 1, (int) 'a', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (int) (byte) -1, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) ' ', (int) (short) 10, (int) (short) 10);
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
    public void test7449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7449");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', (int) (byte) 10, (int) (short) 100, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, 1, (-1), (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) ' ', (int) '#', 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) '#', 32, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 10, (int) ' ');
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
    public void test7450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7450");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray0, 0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7451");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', 10, 35, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 10, (int) '#', (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7452");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, 1, (int) ' ', (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 1, (int) '4', (int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test7453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7453");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 1, (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) (short) 100, (-1), (-1));
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) ' ', (int) (short) 100, (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) '4', (int) '#', 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7454");
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
        // The following exception was thrown during execution in test generation
        try {
            int int64 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) ' ');
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
    public void test7455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7455");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 1, 32, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, 100, 52);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, (int) (short) 100, 100, 1);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7456");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (byte) 100, (int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (-1));
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
    public void test7457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7457");
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
        int int58 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 35, (int) (short) -1, (int) (short) 10, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 10, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
    }

    @Test
    public void test7458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7458");
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
    public void test7459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7459");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', (int) (short) 100, (int) (short) -1, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 10, (int) (short) 0, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, 10, (-1));
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, 1, (int) (short) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) (short) -1);
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
    public void test7460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7460");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, (int) 'a', (int) (byte) 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) 'a', (int) (short) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) '#', (int) (byte) 100, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (byte) 10, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 10, 35, (int) (short) 100);
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
    public void test7461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7461");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) -1, (int) (short) 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (short) 0, (int) (byte) -1, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7462");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 1, 0, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (short) 1, 32, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 0, 1, 100, 52);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, (int) (byte) 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7463");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) ' ', (int) (byte) 1, (int) (byte) 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int99 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray30, (int) (short) -1, 32);
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
    public void test7464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7464");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, (int) (byte) 10, (int) (byte) 100, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7465");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (short) 1, (int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass65 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test7466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7466");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 52, 32, 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 100, (int) (byte) 1, 0);
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
    public void test7467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7467");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) -1, 52, (int) '#');
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
    public void test7468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7468");
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
            int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 10, (int) (short) 100);
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
    public void test7469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7469");
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
        // The following exception was thrown during execution in test generation
        try {
            int int49 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (byte) 100);
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
    public void test7470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7470");
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
    public void test7471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7471");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 100, 10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 35, 100, (int) ' ');
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
    public void test7472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7472");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 100, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 0, (int) '4', 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) (short) 0, 10, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, 0, 52, 0);
        int int34 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) ' ', 0);
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
    public void test7473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7473");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 1, (-1));
        java.lang.Class<?> wildcardClass49 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test7474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7474");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 10, 32, (int) 'a');
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
    public void test7475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7475");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) ' ', (int) '#', (int) '#', (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '4', (int) (short) 1, 100, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 100, (int) '4', (int) (short) 100, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) -1, (int) (byte) -1, (-1), (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 1, (int) (byte) 10, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 100, (int) (byte) 10, (int) '#');
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
    public void test7476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7476");
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
        int int44 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '4', 0, (int) 'a', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) 0, 1, 35);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 52, 35, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) ' ', (int) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass65 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test7477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7477");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (short) 10, 0, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 10, 1, (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 32, (int) (short) -1, (-1), (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) -1, 32, 35);
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
    public void test7478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7478");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, (int) (short) 1, (int) '#', (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (byte) 10, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 32, 52, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 10, 0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1 + "'", int39 == 1);
    }

    @Test
    public void test7479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7479");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, (int) (short) -1, 10, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7480");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (short) 1, 52, (int) (short) 1, (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray30, (int) (byte) 100, (-1), (int) (byte) 100, 35);
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
    public void test7481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7481");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 100, (int) 'a', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int74 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (short) 1, 35);
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
    public void test7482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7482");
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
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, 100, (int) (byte) 10, (int) '4');
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
    public void test7483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7483");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, (int) ' ', (int) (byte) -1, 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 10, 0, (int) (short) 10, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 100, (int) (short) -1, 32);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 32, 32, (int) 'a', (int) (short) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 0, (int) (short) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray2, (int) (short) 10, (int) (short) 100, (int) (byte) 1);
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
    public void test7484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7484");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', (int) '4', (int) (short) 0, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 100, 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, (int) (short) 1, 0, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 10, (int) (short) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, 0, (int) (short) 10);
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
    public void test7485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7485");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, 35, (int) (short) 100, (int) 'a');
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
    public void test7486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7486");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, (int) (short) 0, (int) ' ', (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (-1), (int) (byte) 10, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 0]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
    }

    @Test
    public void test7487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7487");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 10, (int) 'a', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) -1, (int) (short) 100);
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
    public void test7488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7488");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) (byte) 0, (int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass50 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 35]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test7489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7489");
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
        int int62 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass63 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 10 + "'", int54 == 10);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test7490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7490");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) -1, (int) (byte) 1, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 97]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test7491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7491");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) '#', (int) (short) 1, (int) 'a', (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 0, (int) ' ', (int) (byte) 1, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 1, 1, 100, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (byte) 10, (int) (byte) 10, 1, (int) (short) 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 35, (int) '4', (int) '4', (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, 0, 1, 1, (int) 'a');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray2, (int) (short) 10, (-1), 10, 52);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
    }

    @Test
    public void test7492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7492");
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
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 0, 0, 0);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 100, 32, (int) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int75 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, (int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 10 + "'", int58 == 10);
    }

    @Test
    public void test7493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7493");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray0, 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7494");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.floodFill(intArray0, 35, 32, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7495");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 1, (int) ' ', 0, (int) (byte) 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (short) 0, 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test7496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7496");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 100, 100, 35);
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
    public void test7497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7497");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 10, 10, (int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 0, (int) '4', (int) ' ');
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
    public void test7498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7498");
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
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 1, 35, (int) (byte) 100, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test7499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7499");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) '#', 0, (int) 'a', (int) '#');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 100, 0, (int) (byte) 10, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (short) 0, (int) (byte) 0, 1, (int) (short) 100);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, 1, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) 'a', 0, (int) '4', 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 1, 35, (int) '#', 1);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = com.thealgorithms.backtracking.FloodFill.getPixel(intArray6, 35, (int) (short) 1);
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
    public void test7500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7500");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 100, 1, 1, (int) (short) -1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, (int) (short) 1, (int) (byte) 1, (int) '4');
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 10, (int) '4', (int) (short) 10, (int) (byte) 1);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) 0, (int) (byte) 1, 10, 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, 10, (int) (byte) 10, (int) (byte) 1, (int) (byte) 10);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 35, (int) '#', 0);
        com.thealgorithms.backtracking.FloodFill.putPixel(intArray6, (int) (byte) 1, (int) (byte) 1, (int) (byte) 100);
        com.thealgorithms.backtracking.FloodFill.floodFill(intArray6, (int) (byte) -1, 0, (int) (byte) 1, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }
}

