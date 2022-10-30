package BoundaryFill;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        int[] intArray4 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[] intArray9 = new int[] { 100, (short) -1, (short) -1, (short) 0 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray10, (int) (short) 1, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, -1, -1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        int[] intArray2 = new int[] { (byte) 10, 1 };
        int[] intArray5 = new int[] { (byte) 10, 1 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray6, 100, 1);
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (short) -1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        int[] intArray2 = new int[] { (byte) 100, (short) 100 };
        int[] intArray5 = new int[] { (byte) 100, (short) 100 };
        int[] intArray8 = new int[] { (byte) 100, (short) 100 };
        int[] intArray11 = new int[] { (byte) 100, (short) 100 };
        int[] intArray14 = new int[] { (byte) 100, (short) 100 };
        int[] intArray17 = new int[] { (byte) 100, (short) 100 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 100, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 100]");
        org.junit.Assert.assertNotNull(intArray18);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 0, (int) ' ', (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        int[] intArray4 = new int[] { (short) 100, '4', ' ', 100 };
        int[] intArray9 = new int[] { (short) 100, '4', ' ', 100 };
        int[][] intArray10 = new int[][] { intArray4, intArray9 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray10, (int) (byte) 100, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100, 52, 32, 100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 52, 32, 100]");
        org.junit.Assert.assertNotNull(intArray10);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass19 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) 'a', (int) (short) 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 100, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        int[] intArray5 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        int[] intArray11 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        int[] intArray17 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        int[] intArray23 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        int[] intArray29 = new int[] { '#', (short) 1, (byte) 100, (short) 1, 10 };
        int[][] intArray30 = new int[][] { intArray5, intArray11, intArray17, intArray23, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray30, (int) 'a', (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1, 100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 1, 100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[35, 1, 100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[35, 1, 100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[35, 1, 100, 1, 10]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        com.thealgorithms.dynamicprogramming.BoundaryFill boundaryFill0 = new com.thealgorithms.dynamicprogramming.BoundaryFill();
        java.lang.Class<?> wildcardClass1 = boundaryFill0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) 100, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (byte) 1, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[][] intArray2 = new int[][] { intArray0, intArray1 };
        // The following exception was thrown during execution in test generation
        try {
            int int5 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray2, (int) ' ', (int) '4');
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 10, (int) ' ', 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (byte) 10, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass20 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) '#', (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) 100, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        java.lang.Class<?> wildcardClass5 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        java.lang.Class<?> wildcardClass2 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 0, (int) (byte) 100, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        int[][] intArray0 = null;
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) '#', (int) (short) -1, (int) (byte) 1, (int) (byte) 10);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        int[] intArray6 = new int[] { (short) -1, (short) 10, 0, (byte) 1, (byte) 0, 100 };
        int[] intArray13 = new int[] { (short) -1, (short) 10, 0, (byte) 1, (byte) 0, 100 };
        int[] intArray20 = new int[] { (short) -1, (short) 10, 0, (byte) 1, (byte) 0, 100 };
        int[] intArray27 = new int[] { (short) -1, (short) 10, 0, (byte) 1, (byte) 0, 100 };
        int[][] intArray28 = new int[][] { intArray6, intArray13, intArray20, intArray27 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray28, (int) (byte) 100, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 10, 0, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 10, 0, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 10, 0, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1, 10, 0, 1, 0, 100]");
        org.junit.Assert.assertNotNull(intArray28);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', (int) (short) 10, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '4', (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (short) 0, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass21 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) '#', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '4', (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        int[] intArray3 = new int[] { (byte) 0, (short) 1, '#' };
        int[] intArray7 = new int[] { (byte) 0, (short) 1, '#' };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray8, (int) (byte) 0, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 1, 35]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (int) '#', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        int[] intArray2 = new int[] { (byte) 1, (-1) };
        int[] intArray5 = new int[] { (byte) 1, (-1) };
        int[] intArray8 = new int[] { (byte) 1, (-1) };
        int[] intArray11 = new int[] { (byte) 1, (-1) };
        int[] intArray14 = new int[] { (byte) 1, (-1) };
        int[][] intArray15 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14 };
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray15, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, -1]");
        org.junit.Assert.assertNotNull(intArray15);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) 10, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) (short) 0, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '4', (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass23 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        java.lang.Class<?> wildcardClass3 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, 97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) -1, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (byte) 1, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (int) ' ', 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass26 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass22 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', (int) (byte) 0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 1, 1, 97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, 0, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        int[][] intArray0 = null;
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) -1, 0, 100, (int) (short) 100);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (short) 10, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) (short) 0, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 0, (int) 'a', (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 100, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (byte) 1, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        int[] intArray5 = new int[] { (short) 1, (short) 100, (short) 10, (byte) -1, '#' };
        int[] intArray11 = new int[] { (short) 1, (short) 100, (short) 10, (byte) -1, '#' };
        int[] intArray17 = new int[] { (short) 1, (short) 100, (short) 10, (byte) -1, '#' };
        int[] intArray23 = new int[] { (short) 1, (short) 100, (short) 10, (byte) -1, '#' };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 100, 10, -1, 35]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 10, -1, 35]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 100, 10, -1, 35]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[1, 100, 10, -1, 35]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, 97, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) 0, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, 0, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', (int) (short) 0, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, 97, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 97, 0, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        int[] intArray3 = new int[] { (short) 100, (short) 10, (byte) 0 };
        int[] intArray7 = new int[] { (short) 100, (short) 10, (byte) 0 };
        int[] intArray11 = new int[] { (short) 100, (short) 10, (byte) 0 };
        int[] intArray15 = new int[] { (short) 100, (short) 10, (byte) 0 };
        int[] intArray19 = new int[] { (short) 100, (short) 10, (byte) 0 };
        int[][] intArray20 = new int[][] { intArray3, intArray7, intArray11, intArray15, intArray19 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray20, (int) (short) 10, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 10, 0]");
        org.junit.Assert.assertNotNull(intArray20);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) '#', (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass23 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) -1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) '#', (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 0, (int) '#', (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) (short) 10, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 10, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass31 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, 97, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass23 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '4', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 0, 100, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) 'a', (int) (short) 1, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) 100, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) 10, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) 'a', (int) '#', (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, 1, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        java.lang.Class<?> wildcardClass26 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 100, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass26 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 10, (-1), (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 1, 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (int) '4', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, 97, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 1, 10, 97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 1, 100, (int) ' ');
        java.lang.Class<?> wildcardClass29 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        java.lang.Class<?> wildcardClass4 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        java.lang.Class<?> wildcardClass26 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', (int) (short) 1, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, (int) (short) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 10, (-1), (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) -1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 1, 100, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) '#');
        java.lang.Class<?> wildcardClass33 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) '#', 97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 100, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        int[] intArray4 = new int[] { (byte) -1, (-1), (short) 0, 97 };
        int[] intArray9 = new int[] { (byte) -1, (-1), (short) 0, 97 };
        int[] intArray14 = new int[] { (byte) -1, (-1), (short) 0, 97 };
        int[] intArray19 = new int[] { (byte) -1, (-1), (short) 0, 97 };
        int[] intArray24 = new int[] { (byte) -1, (-1), (short) 0, 97 };
        int[] intArray29 = new int[] { (byte) -1, (-1), (short) 0, 97 };
        int[][] intArray30 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24, intArray29 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray30, (int) '#', (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1, -1, 0, 97]");
        org.junit.Assert.assertNotNull(intArray30);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[][] intArray4 = new int[][] { intArray0, intArray1, intArray2, intArray3 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray4, (int) (byte) 1, (int) (byte) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[]");
        org.junit.Assert.assertNotNull(intArray4);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', 0, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 1, 97, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        int[] intArray3 = new int[] { ' ', (short) 100, (byte) -1 };
        int[] intArray7 = new int[] { ' ', (short) 100, (byte) -1 };
        int[][] intArray8 = new int[][] { intArray3, intArray7 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray8, (int) 'a', 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 100, -1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 100, -1]");
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 100, (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 1, 100, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, 1, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 10, (-1), (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) '4', 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 0, (int) (short) 100, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, 10, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) '#', (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) 'a', 0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 1, 1, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass30 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) '#', (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) 'a', 100, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) '#', (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 0, 0, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        int[] intArray2 = new int[] { (short) 100, (short) 10 };
        int[] intArray5 = new int[] { (short) 100, (short) 10 };
        int[] intArray8 = new int[] { (short) 100, (short) 10 };
        int[] intArray11 = new int[] { (short) 100, (short) 10 };
        int[][] intArray12 = new int[][] { intArray2, intArray5, intArray8, intArray11 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 0, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 97, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) -1, 97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 1, 100, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) 'a', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) 'a', 1, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (short) -1, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '4', 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) 'a', (int) (byte) 100, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        java.lang.Class<?> wildcardClass32 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass29 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, 0, (int) (short) 10, 1);
        java.lang.Class<?> wildcardClass38 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) 10, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) -1, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 97, 0, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        int[] intArray2 = new int[] { (byte) -1, (byte) 100 };
        int[] intArray5 = new int[] { (byte) -1, (byte) 100 };
        int[][] intArray6 = new int[][] { intArray2, intArray5 };
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray6, 10, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) '#', 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) ' ', (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, 0, (int) (byte) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 0, 1, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 100]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 1, 100, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, 0, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, 0, 10);
        java.lang.Class<?> wildcardClass28 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (short) 1, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass30 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) ' ', (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) ' ', (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, 0, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (int) (byte) 1, (int) (short) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 0, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) ' ', (int) (short) -1, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (short) 10, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '4', 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, 0, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        java.lang.Class<?> wildcardClass33 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 10, (int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, 1, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, 97, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 100, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 100, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, 0, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) ' ', 100, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 10, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, 0, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) '#', (int) (byte) 10, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) 0, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (short) 100, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) 0, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass32 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 100, 0, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (short) 0, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass31 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) -1, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 0, 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 100, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (short) 100, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) -1, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 0, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, 0, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, 10, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) -1, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) 1, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 35, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        int[][] intArray0 = new int[][] {};
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        java.lang.Class<?> wildcardClass27 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (byte) 10, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 100, 97, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, 100, (int) (short) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) -1, (int) (byte) 10, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 97, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 100, 10, 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, 1, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (short) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass29 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, (int) (byte) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) -1, (int) (byte) 10, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) 0, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 100, (int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 10, (int) (byte) 10, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (byte) 1, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) 10, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) '#', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) -1, (int) (byte) 10, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) 1, (int) '#', 97);
        java.lang.Class<?> wildcardClass44 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) 100, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 10, 0, 97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        java.lang.Class<?> wildcardClass33 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (byte) 10, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) 0, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, 97, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 100, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (byte) 100, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) ' ', (int) (short) -1, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 10, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) -1, (int) (byte) 10, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) -1, (int) (byte) 10, 97);
        java.lang.Class<?> wildcardClass39 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass30 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 1, 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass28 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) '4', 97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, 1, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 1, (int) (byte) 1, (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '4', (int) (short) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) 0, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, 0, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) 100, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) -1, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int[][] intArray0 = null;
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (-1), (int) ' ', 100, 10);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        java.lang.Class<?> wildcardClass27 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) 100, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 100, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', 1, (int) (byte) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (short) 10, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) (short) 10, (int) 'a');
        java.lang.Class<?> wildcardClass39 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 0, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        int[] intArray4 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray9 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray14 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray19 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray24 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray25);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray25, (int) (short) 10, (int) (short) 0, 97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 97, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 100, (int) (short) -1, (int) '4', (int) (short) 10);
        java.lang.Class<?> wildcardClass33 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) -1, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) ' ', 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass32 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) 0, 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', 10, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, 0, (int) (short) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 100, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 10, (int) 'a', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (short) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), (int) (short) 100, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 100, 1, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) 'a', (int) 'a', (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass26 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, 1, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) '#', (int) ' ', (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (byte) 1, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 10, (int) (short) 10, (int) '4', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', 100, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '4', (int) (short) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) 100, (int) 'a', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (-1), 0, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 10, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 1, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass25 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (byte) 1, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, 0, 97);
        java.lang.Class<?> wildcardClass40 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        int[][] intArray0 = null;
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 1, (int) (short) -1, (int) '4', (int) '4');
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), (int) (short) 100, (int) '4', (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 10, 10, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', (int) (byte) -1, (int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) 'a', 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) 0, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) 100, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass29 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 10, 10, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (int) (byte) 100, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) '#', (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 100, (-1), (int) (byte) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (short) -1, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) -1, (int) (byte) 10, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) 1, (int) '#', 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) -1, (int) (byte) 10, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) 1, (int) '#', 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 10, 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 0, (int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, 0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass33 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) -1, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 100, 10, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass32 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), (int) (short) 100, (int) '4', (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 0, (int) (byte) 1, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        int[][] intArray0 = null;
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (-1), (int) (short) 100, (int) (byte) -1, (int) (short) 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 97, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) '#', (int) (short) 10, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) -1, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) ' ', (int) (short) -1, (-1), 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 97, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        java.lang.Class<?> wildcardClass9 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (int) (byte) -1, (int) (short) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (byte) 100, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (byte) 10, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) -1, (int) (byte) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass28 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        int[] intArray4 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray9 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray14 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray19 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray24 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray25);
        java.lang.Class<?> wildcardClass27 = intArray25.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[52, -1, 10, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (byte) 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 1, (int) '4');
        java.lang.Class<?> wildcardClass29 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (byte) -1, (int) (byte) 10, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 10, (-1), (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }
}

