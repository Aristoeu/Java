package BoundaryFill;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 97, (int) '#');
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
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) -1, 1, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) -1, 100, (int) ' ', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 10, (int) (byte) 10, (int) (byte) -1, (int) (short) 100);
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
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 100, (-1), (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 0, (int) (short) -1, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, 35, 52);
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
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (short) 0, (int) (short) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, 35, 97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 35, 1);
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
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass27 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 10, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, 52);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 100, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 1, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (-1), (int) (byte) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
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
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 100, 0);
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
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, 1, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
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
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        int int33 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (-1), 0, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) '#', (int) (short) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 100, (int) (short) 1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 10, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (byte) 10, 1, (-1));
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
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 0, (int) (byte) 1, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
            int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (byte) 10);
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
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int22 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 35, (int) '#', 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (int) '4', (int) 'a', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        int int33 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, 1);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), 0, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, (int) (byte) -1, 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (byte) 0, 52, (int) (byte) 100);
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
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass41 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) -1, (int) ' ', (int) '#', 52);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) 1, (int) (short) -1, 97, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) 1, 0, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[97, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, 0, (int) (byte) 10);
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
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (short) 1, 100);
        int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (int) (byte) 0, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (-1), 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (-1), 0);
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
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', 10, (int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int48 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, 1, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, 0, (int) (short) 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, 10, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 10, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, (int) (short) 100, 52);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 52, (int) (short) 10, 35);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) 'a', (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) 1, (int) '4', (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, 0, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) 100, 100, (int) 'a');
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
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) -1, (int) (byte) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 52, (int) (byte) 1, (int) (short) 10, (-1));
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
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 0, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 100, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), (int) (short) 100, (int) '4', (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) '#');
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
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, 35, (int) (byte) 1);
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
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        int int33 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), 1, (int) (byte) 10, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 97, 0, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), (int) (byte) 1, 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 52, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        int[] intArray0 = new int[] {};
        int[] intArray1 = new int[] {};
        int[] intArray2 = new int[] {};
        int[] intArray3 = new int[] {};
        int[] intArray4 = new int[] {};
        int[] intArray5 = new int[] {};
        int[][] intArray6 = new int[][] { intArray0, intArray1, intArray2, intArray3, intArray4, intArray5 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray6);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray6, (int) (short) -1, (int) (byte) -1, (int) '#', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray6, 97, (int) (short) 0, 97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 6");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
        org.junit.Assert.assertNotNull(intArray6);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
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
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 35, (int) (short) -1);
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
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 0, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) '4', (int) '#', (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (-1), (int) ' ', 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (byte) 100, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, 0, (int) (byte) 0, (int) '#', (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) '4', (int) (short) 0, 35, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
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
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), 0, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, 1, 97, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass38 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 0, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 97, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 52, (-1), (int) 'a', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '4', 0, (int) (byte) 0);
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
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) -1, (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) (short) 100, 100);
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
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', 52, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 35, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 10, (int) (short) -1, 97, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) '#', (-1), 100, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) -1, 35, (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) '4', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
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
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 100, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, 35, (int) (byte) -1, (int) (byte) 1);
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
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) (byte) -1, (int) '#');
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, 0, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 1, (-1), 100, 100);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 35, 0, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '4', (int) (short) 10);
        int int47 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass48 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, 35, (int) (short) 100, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 100, (-1), (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 0, (int) (short) -1, (int) (byte) 100, 0);
        int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (byte) 100, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 52 + "'", int42 == 52);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (int) (byte) -1, (-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 100, (int) '#', 0);
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
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) (byte) 10, (int) '4');
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
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) (byte) -1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 0, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 52, 52, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', (int) (byte) 100, 10, 0);
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
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, 97, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 35, 1, 100);
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
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (short) -1, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, 35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (-1), (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) ' ', 0);
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
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (short) -1, (int) '4', 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 35, 0, 52);
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
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) '#');
        int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 1);
        java.lang.Class<?> wildcardClass42 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), 1, (int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 0, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (byte) 10, (int) (byte) -1, (-1));
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
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 100, (int) '4', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (int) '#', (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (-1), (int) (short) 0, (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) '4', (int) (byte) -1, (int) (byte) 0);
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
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', 52, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (byte) 0, (int) (byte) 0, (int) '4');
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
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 0, 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, (int) (short) 100, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
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
        int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, (int) (short) 100, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) -1, (int) (byte) 0, (int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (-1), (int) ' ', 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 10, (int) (byte) 0);
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
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) '#', (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (byte) 1, (int) (short) 10, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 100, (int) (short) 10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 52, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 100, 1, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, 0, 52, (int) ' ');
        java.lang.Class<?> wildcardClass46 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (-1), (int) (short) -1);
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
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 0, (int) ' ', (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) (byte) 100, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 0, (int) (short) 0, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) ' ', (int) (short) 1);
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
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, 0, 0, 97);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', (int) (short) 1, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 0, (int) 'a', 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (-1), 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, 0, 10, (int) (byte) -1);
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
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, 35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 52, (int) (byte) 10, (int) (byte) 0, (int) '#');
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
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 10, (int) (short) -1, 97, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) '#', (-1), 100, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) -1, 35, (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) (byte) 0, (int) (byte) 100);
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
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, 52, 10);
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
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
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
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 10, (int) '4');
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
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), 0, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, (int) (byte) -1, 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) '4', (int) '#');
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
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (-1), (int) (short) 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 52, 100);
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
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 52, (int) (short) -1, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) 1, (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', (-1), (int) ' ');
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
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, (int) (short) 10);
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
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) '4', (int) (short) 0, (int) (short) 1);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 0, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass40 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 10, (-1), (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, 35, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, (-1));
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
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (byte) 100, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 10, 10, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 35, (int) (short) 0, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 10, (int) (short) 1, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) '4', (int) (short) 100, 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
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
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 52, (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 35, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), 1, (int) (byte) 10, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) -1, (int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 10, (-1), 1, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), 100, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass38 = intArray18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) '#', (int) (short) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) '#', (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 10, (-1), (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 0, 52, 97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
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
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 1, (-1), (int) (short) 0, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 10, (int) (short) 0, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, 0, 52);
        java.lang.Class<?> wildcardClass30 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (byte) 1, (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, 52);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 10, (-1), 1, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        java.lang.Class<?> wildcardClass34 = intArray18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 1, 100, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) -1, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
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
            int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', (int) (byte) 1, (int) (byte) 100);
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
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, 10, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 100, (int) (byte) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, 0, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (short) -1, (int) (byte) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 35, (int) (byte) 100, (int) (byte) 100);
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
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) (byte) -1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
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
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (short) -1, (int) (byte) 100);
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
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (int) (byte) 100, (int) ' ');
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
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
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
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (-1), (int) ' ', 100, (-1));
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
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
        int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass41 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) 10, (int) (short) 1, 35);
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
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 35, (int) ' ', (int) ' ', (int) (byte) -1);
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
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) -1, (int) ' ', (int) '#', 52);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) 1, (int) (short) -1, 97, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, 10, (int) ' ', (int) (byte) 0);
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
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), 0, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, (int) (byte) -1, 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 100, 35);
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
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), 1, (int) (byte) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 10, (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (short) -1, (int) (short) 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass31 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 100, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) ' ', 97);
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
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) ' ', 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) '4', (int) (short) 0, (int) (short) 1);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) 'a', (int) (short) 0);
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
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (short) 1, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, 10, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) 'a', 35, (int) (byte) 100);
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
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) -1, (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) 'a', (int) (byte) 1, 35);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', (int) 'a', (int) 'a');
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
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (-1), (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (byte) -1, (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 100, (int) '4', (int) (short) 100);
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
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 10, (int) (byte) 1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 100, 1, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', (int) (short) 0);
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
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', 10, 0);
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
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, 10, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 10, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 1, (int) '#');
        int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 35, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, 97, (int) ' ');
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
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (short) 100, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 0, 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) -1, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (byte) 100, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 100, (int) (short) 1, (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
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
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (-1), (int) '#', (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 35, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, 1, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 10, (-1), (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 0, (int) (byte) 0, (-1), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) -1);
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
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', (int) '#');
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) (byte) 0, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (short) -1, (int) ' ', (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (byte) 1, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 100, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (byte) 0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass49 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) 'a', 35, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', 10, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (int) (short) 0, (int) (short) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', (int) ' ', 52);
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
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 10, (int) (short) -1, 97, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) '#', (-1), 100, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) -1, 35, (int) '4', (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        java.lang.Class<?> wildcardClass50 = intArray18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) '#', (int) (short) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) 1, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) -1, (int) (byte) 0, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) '#', (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 10, (-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, (int) (byte) 100);
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
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) '4', (int) (short) 0, (int) (short) 1);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 0, (int) (short) -1, (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 10, (int) 'a', (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
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
        int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 0);
        int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, 100, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, (int) '4', 100);
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
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (short) -1, (int) '4', 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (-1), (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (-1), (int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass44 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', (int) (byte) 1, 52, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 0, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
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
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 10, (-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass30 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (-1), (-1));
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
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 1, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int45 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
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
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 0, (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) -1, (int) (byte) 10, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (short) 1, (int) (short) -1, 100);
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
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (-1), 0, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 100, (int) (byte) 10);
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
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) '#', (int) (short) -1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 52, (int) (byte) 0, (int) (byte) 10);
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
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 52, (int) (short) 10, 35);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 100, 1, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (byte) 0, 52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 10, (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', (int) (short) 10, (int) (short) 10);
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
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 100, (int) (byte) 10, (int) (byte) -1);
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
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        java.lang.Class<?> wildcardClass32 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 1, (-1), 100, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 1, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) (short) 1, (int) (byte) 10, 97);
        java.lang.Class<?> wildcardClass39 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) 'a', 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 1, (int) 'a', 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 100, 1, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, 0, 52, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (short) 10, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        int[] intArray4 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray9 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray14 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray19 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray24 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray25);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray25, 52, (int) (short) -1, 0, 0);
        int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray25, (int) (byte) 1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray25);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray25, (int) (short) -1, (int) 'a', (int) (byte) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray25, (int) (byte) 10, (int) (short) 1, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (short) 10, 52, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) -1, (int) (byte) 10, 1);
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
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) -1, (int) (byte) 0, (-1));
        int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, 0);
        int int44 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) -1, (int) '#', 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) ' ', (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), 1, (int) (byte) 10, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) '4', (int) '#');
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
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
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
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (-1), 52);
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
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int48 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) -1, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 100, (int) (short) 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) (short) 10, (int) '4', (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 97, (int) (short) 0, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
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
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, 1);
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
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 35, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) '4', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
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
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (byte) 1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (short) 100, 100, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 100, (int) '#');
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
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 10, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (short) 1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, (int) (byte) 100, 100);
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
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 0, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) 'a', 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) '4', (int) (short) 0, (int) (short) 1);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) -1, 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 10, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 52, 52, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, (int) (byte) -1, 97);
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
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) 'a', (-1), (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass37 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '4', (int) (short) 10);
        int int47 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 1, (int) ' ');
        java.lang.Class<?> wildcardClass52 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[97, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 32, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 100 + "'", int47 == 100);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        int[] intArray4 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray9 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray14 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray19 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[] intArray24 = new int[] { '4', (short) -1, 10, (short) 0 };
        int[][] intArray25 = new int[][] { intArray4, intArray9, intArray14, intArray19, intArray24 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray25, 10, 0);
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
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, 10, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) -1, 0, (int) (short) 10);
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
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), 1, (int) (byte) 10, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 97, 0, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) -1, (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, (int) (short) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
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
            int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (-1), 35);
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
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
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
        int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 0);
        int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) '4', (int) (short) 0, (int) (short) 1);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 10, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 10, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, 1, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, (int) '4', (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 10, (-1), (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 10, 0, 10);
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
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, 52, (int) (byte) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 1, (int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass40 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, -1]");
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
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) '4', (int) (short) 0, (int) (short) 1);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 1, (int) 'a', (int) 'a', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass31 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', (int) 'a');
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
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 100, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
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
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass37 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) (short) 10, (int) '4', (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (short) -1, (int) ' ', (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (byte) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 35, 52, (int) (byte) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 0, (int) ' ', (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 1, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (-1), (int) (byte) 10, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) -1, (int) ' ', 1);
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
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 100, (int) 'a', 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass34 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 10, (int) (byte) 100);
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
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (short) -1, (int) '4', 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, 0, 0);
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
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, (int) (short) 1, 0);
        java.lang.Class<?> wildcardClass38 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 10);
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
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '#', (int) (byte) -1, (int) 'a', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (byte) -1, (int) (byte) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) 'a', (int) (short) 10, (int) (short) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 10, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (short) -1, (int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 52, (-1), (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 100, (int) (short) -1, 52, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) '4', (int) '#', (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '4', (int) '4');
        java.lang.Class<?> wildcardClass34 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) -1, (int) ' ', (int) '#', 52);
        java.lang.Class<?> wildcardClass36 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (short) -1, (int) ' ', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) '4', (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (int) (byte) -1, (-1), (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) 1, (int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 100, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 100, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) '4', (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (int) (short) 10, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (byte) 100, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) 'a', 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (short) -1, (int) '4', 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass34 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 52, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
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
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 97, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (byte) 100, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (int) (short) -1, 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) '#', (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) -1, 1, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
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
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 10, (int) (short) -1, 97, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 1, (-1));
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
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (short) 10, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass24 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), 0, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 1, (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
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
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) '4', 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
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
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, 35, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (short) 0, (int) (short) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (short) -1, (int) (short) -1, 0, (int) ' ');
        java.lang.Class<?> wildcardClass41 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '4', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 0, (int) (short) 0, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) ' ', (int) (short) 100);
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
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 100, (-1), (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 0, (int) (short) -1, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (short) 100, (-1));
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
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int48 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, 0, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
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
        int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) -1, (int) (byte) 0, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) '#', 97, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 52, 1, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 10, (int) (short) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (short) -1, (int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, (int) (byte) 1);
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
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 100, (-1), (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
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
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 52, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
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
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, 1, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (byte) 1, (int) '#');
        int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (short) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) 100, (int) (short) -1, (int) (short) -1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 10, (-1), (int) (byte) 100, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int52 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 0, (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) -1, (int) (byte) 10, (int) (short) -1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
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
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, 1, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (short) -1, 0, (int) (short) -1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) 1, (int) '#', 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 52, (int) (short) 100, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 100, 0, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, 10, 97, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) '4', (int) (short) -1, (-1), (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) (byte) 0, (-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), (int) ' ', (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) 1, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (byte) 100, (int) (byte) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 52, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (short) 10, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 1, (-1), 100, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 100, 100, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) 10, (int) (byte) -1, (int) (byte) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, 1, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
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
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
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
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) '#', (int) (short) -1);
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
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 1, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 0, (int) (byte) 0, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 35, 10, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) 10, (int) (short) 0, (int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) 'a', 0, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 35, 1, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) -1, (int) ' ', 52);
        java.lang.Class<?> wildcardClass38 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int[][] intArray0 = null;
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) -1, 0, 0, 100);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, 0, (int) (byte) 0, (int) '#', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
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
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass33 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', 52, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) '#', 97, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 97, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) -1, (int) ' ', 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, (int) (byte) 0, (int) ' ');
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
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (-1), 1, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass34 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) -1, (int) (byte) 1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, 0, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (int) (byte) 10, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (short) -1, 0, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, (int) (byte) -1);
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
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, 35);
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
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 10, (int) (short) -1, 97, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 0, (-1), 100, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) '4', (int) (byte) 100, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (-1), (int) (byte) 1, (int) 'a', (int) (short) 0);
        int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 52 + "'", int35 == 52);
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (byte) 0, (int) (short) 0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 100, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (int) '#', (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 35, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, 35);
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
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        int[][] intArray0 = null;
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 0, (int) (byte) -1, 1, (int) (byte) 10);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, 1, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (byte) 1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 100, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (int) (short) 0, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) -1, 1, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) -1, 0, 52, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 100, 100, (int) (byte) -1);
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
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) ' ', 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        int int26 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, (-1), 1, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass29 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', (int) (byte) 1, (int) '#');
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
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, 35, (int) (short) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
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
            int int30 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) ' ', 100);
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
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, 35, 35);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass33 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 10, 52, (int) '#');
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
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (-1), (int) (byte) 1, (int) 'a', (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, 10, (int) (byte) 10);
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
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 0, (int) (short) 10, (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) (byte) 100, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) ' ', (int) (short) 100, (int) (byte) 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 52 + "'", int34 == 52);
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 10, (int) (byte) 10, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, 10, (int) (short) -1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) (byte) 10, 35);
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
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '4', 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
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
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int48 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) -1, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int56 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int22 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, (int) (short) -1, (int) (short) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, (int) '#', (int) (short) 1);
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
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 1, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) '4', 0);
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
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) ' ', (int) '#', (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass33 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), 0, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, (int) (byte) -1, 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (short) -1, (int) '4', 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (-1), (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int42 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass45 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, 0, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (short) 0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (short) 0, (int) (short) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (short) -1, (int) (short) -1, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int43 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 100, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
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
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 10, 0);
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
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (short) -1, (int) '4', 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (-1), (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (-1), (int) 'a', (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass45 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) -1, 52, 35);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', (int) (short) 100, (-1));
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
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, 100, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, (int) (byte) 0, (-1), (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 1, (int) (short) 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (byte) -1, (int) (byte) 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 100, (int) ' ');
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
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (byte) 100, 0, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 52, (int) '#', (int) '#');
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
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
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
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
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
        int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        int[][] intArray0 = null;
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) -1, (int) (byte) -1, (int) (short) 1, 10);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 35, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
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
            int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
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
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) -1, (int) (byte) 0, (-1));
        int int41 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, 0);
        int int44 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 100 + "'", int41 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 0, (int) (byte) 10, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) -1, (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) '#', 52, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), 0, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 10, (int) (byte) -1, 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (-1), (int) (byte) 100, (int) (byte) 100);
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
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 52, (int) (short) -1, (int) (short) 100, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) -1, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (short) -1, (int) '4', 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (-1), (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (-1), (int) 'a', (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (byte) 10, 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int51 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, (int) ' ');
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
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) -1, (int) (byte) 100, 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 97, 35, (int) 'a');
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
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (int) (byte) -1, (-1), (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, (-1), (int) (short) 1);
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
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) -1, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, 0, (int) (byte) 0, (int) '#', (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) 'a', (-1), (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
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
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) -1, 1, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 10, (-1), (int) (short) 100, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) '#', (int) ' ', 52);
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
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (short) -1, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, 100, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) 10, (int) (short) -1, 97, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, 0, 35, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), 1, (int) (byte) 10, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 52, 1, (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) -1, 1, (int) (byte) 10, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (short) -1, 100, (int) ' ', (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, 10, (int) 'a', (-1));
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
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), 0, (int) (byte) -1, 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, 35, 35);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, 1);
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
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), 0, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 1, (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 0, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 5");
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
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        int[][] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from object array because \"image\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, (-1), 0, (int) '4');
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 1, 100, (int) ' ');
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) '#');
        int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass37 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) -1, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 35, 97, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 10, (int) '4');
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
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
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
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, 10, (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int48 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) -1, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 35, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 100 + "'", int48 == 100);
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, 10, (int) (short) -1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (short) 10, (int) '#', 10);
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
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 10, (int) (short) -1, (int) (byte) 1, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 100, 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
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
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) -1, 0, 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        int int20 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 0, 52, 97, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        int int33 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, 100);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, 10, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (int) (byte) -1, (-1), (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass35 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) -1, 0, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, (int) (byte) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) -1, (int) ' ', 52);
        // The following exception was thrown during execution in test generation
        try {
            int int40 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) -1, (int) (short) 1);
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
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
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
            int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 10, (int) (byte) 10);
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
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, 100, (int) (short) -1, 100, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (short) 100, (int) (short) -1, 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray0, (int) '4', (int) (byte) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass32 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
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
        int int34 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 10, 0, 97);
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int[][] intArray0 = null;
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray0, (int) (byte) 100, (int) (byte) -1, 52, 35);
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), 1, (int) (byte) 10, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (-1), 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, (int) (short) 10, (-1), (int) (short) 10, (-1));
        java.lang.Class<?> wildcardClass31 = intArray24.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 1, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (-1), (int) (byte) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass39 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        int[] intArray2 = new int[] { (short) -1, 1 };
        int[] intArray5 = new int[] { (short) -1, 1 };
        int[] intArray8 = new int[] { (short) -1, 1 };
        int[] intArray11 = new int[] { (short) -1, 1 };
        int[] intArray14 = new int[] { (short) -1, 1 };
        int[] intArray17 = new int[] { (short) -1, 1 };
        int[][] intArray18 = new int[][] { intArray2, intArray5, intArray8, intArray11, intArray14, intArray17 };
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (-1), (int) (short) 100, 10, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray18, (int) (byte) 0, (int) (short) 0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, 0, (int) (byte) 0, (int) '#', (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) ' ', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 1]");
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
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        int[] intArray5 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray11 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray17 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[] intArray23 = new int[] { '4', (byte) 10, (byte) 100, (short) -1, (byte) 10 };
        int[][] intArray24 = new int[][] { intArray5, intArray11, intArray17, intArray23 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, 1, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray24);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (byte) 1, (int) (byte) 1, (int) '#');
        int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray24, (int) (byte) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray24, 10, (int) (byte) -1, (int) (byte) 10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray24, (int) (short) 100, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 35, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[52, 10, 100, -1, 10]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 52 + "'", int39 == 52);
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 1, (int) (byte) 1, 97, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int27 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) 'a', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int22 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (short) 100, 0, 97);
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
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, 52);
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
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray18);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) -1, (int) (byte) 100, 100, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray18, (int) (byte) 1, (int) (short) -1, (-1), (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int48 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray18, (int) ' ', (int) (short) 10);
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
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) -1, (int) (byte) -1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (-1), (int) (short) 0, (int) 'a');
        java.lang.Class<?> wildcardClass34 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 97, (int) (short) -1, (int) (short) -1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 100, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
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
        int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (byte) -1, (int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 97, (int) (short) 0, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 100, (int) (byte) -1, (int) (byte) 100, (int) (short) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', 1, 35);
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
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 1, (int) (short) 0, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass33 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (int) (byte) 1, (int) (short) 10, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 97, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) '4', (int) (byte) -1, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) ' ', 1, 0);
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
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
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
        int int38 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 1, 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 1, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (byte) -1, (int) (byte) -1, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        java.lang.Class<?> wildcardClass50 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, -1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, 0, (int) (short) -1, (int) '4', (int) 'a');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (short) 10, 52, 0);
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
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (-1), 1, (int) (byte) 10, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 10, 0, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int35 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 10, (int) (short) -1, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 100 + "'", int35 == 100);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) '4', 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, 100, (int) (byte) -1, (int) (byte) -1, (int) '#');
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) '#', (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) 'a', 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[52, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (short) 0, (int) (short) 0, (-1), 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 100, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray3);
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, (int) (short) 1, 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 0, 0, (int) (byte) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 10, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) -1, (int) (byte) 0, (int) (byte) 1, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) ' ', (int) (short) 100, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (int) (byte) 1, (int) 'a', 52);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 100, 0, (int) (short) 100);
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
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 1, 0, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) -1, (-1), 0, 97);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (byte) 100, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
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
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (byte) 1, (-1), (int) ' ', 0);
        int int31 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (byte) 0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int39 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 10, (int) (byte) -1, (int) '#', (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 1, 0, (int) (short) 0, (int) (short) 100);
        int int32 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, 1, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (int) (short) 100, (int) (short) -1, (int) (byte) 0, (-1));
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 0, 0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        int[][] intArray0 = new int[][] {};
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray0, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        int[] intArray2 = new int[] { (byte) 0, (short) 100 };
        int[][] intArray3 = new int[][] { intArray2 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray3, (int) (short) 0, (int) (short) 1, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray3, (int) (short) 0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray3, (int) (byte) -1, 10, 0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray3);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 32]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        int[] intArray5 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[] intArray11 = new int[] { 100, 'a', 'a', 'a', (short) 10 };
        int[][] intArray12 = new int[][] { intArray5, intArray11 };
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) ' ', (int) (byte) 10, (int) (byte) -1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        int int21 = com.thealgorithms.dynamicprogramming.BoundaryFill.getPixel(intArray12, (int) (short) 1, 0);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.boundaryFill(intArray12, (-1), (int) (short) 0, (int) (short) -1, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, (int) (byte) 1, (int) (byte) 1, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.BoundaryFill.printImageArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.dynamicprogramming.BoundaryFill.putPixel(intArray12, 52, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 97, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 1, 97, 97, 10]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }
}
