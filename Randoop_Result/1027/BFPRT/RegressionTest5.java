package BFPRT;

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
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, (int) (short) -1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 0, (int) '#');
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) (short) 10, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.bfprt(intArray19, 0, (int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 10, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray13, 35, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 10, (int) (byte) 10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, 100, (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray17, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 100);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 35);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[10]");
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray7, 0, 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.swap(intArray12, 0, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray5, 52, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, 100);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray7, 52, (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray13, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -3");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 10, (int) (short) 100);
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, (int) (short) -1);
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
        int int24 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) '4', 10);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, (int) 'a', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -7");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) ' ', (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 1, 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, (-1), 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 10, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, 100, 0);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, 1, 10);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 97);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray20, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.others.BFPRT.bfprt(intArray20, (int) ' ', (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray0, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray7, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray9, 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray8, (int) (byte) 10, 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '4');
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = intArray16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.getMedian(intArray22, 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 1, 0, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.getMedian(intArray18, (int) 'a', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 0, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray15, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) '#', (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray7, 32, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 65 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 52, (int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) ' ');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) (byte) -1, 97, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, 100);
        java.lang.Class<?> wildcardClass21 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '4');
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray4, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (int) (byte) 100, 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -8");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 35, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, (int) 'a', (int) '4', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        com.thealgorithms.others.BFPRT.swap(intArray2, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 97, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray1, 0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 32, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 1, (int) (short) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (byte) 1, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 97, 35);
        java.lang.Class<?> wildcardClass15 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray17);
        int int21 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray17, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray17, (-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, (int) (short) 100, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (byte) 100, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 0, 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 0);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) -1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray6, (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1]");
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray3, 1, 1, 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray17, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.others.BFPRT.partition(intArray17, (int) '4', 35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass3 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 0, 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (short) 10, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100]");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) (short) 10, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray1, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) 1, (int) (byte) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) 'a');
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) (byte) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, (int) '4');
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, (int) (short) 10);
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray23, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 0, 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, 52, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100]");
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 32]");
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (byte) 1, (int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray5, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, 32, (int) (byte) 10);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, 0, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100]");
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 0, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) '#', 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (byte) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, 32, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) ' ');
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 35);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 35, 52]");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 10);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) '4', 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 1, (int) (byte) 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray6, (int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray2, 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (int) (short) 10, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, 32, 52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (byte) -1, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray11, 1, (int) (short) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray6, (int) ' ', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 97);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray12, (int) '#', (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 37 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 0, (int) (byte) 10);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray9, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.swap(intArray11, (int) (short) 1, (int) (byte) 1);
        int int21 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.bfprt(intArray11, 10, (int) (byte) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (byte) 1, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 10, 1]");
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 1, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 32);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (-1), (int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (-1), (int) (byte) -1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray16, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray7, 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 32, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, 1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) '4', 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (byte) -1, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 10, 1]");
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, 35, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray9, 35, (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 32, 97]");
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 0, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray15, 97, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = intArray13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray16, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray7, (int) (short) 1, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray6, (int) ' ', 32, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (byte) 100, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNull(intArray5);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 100, 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray10, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 18 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 0, 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray14, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray17, 1, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray17, 52, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[1, 0]");
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray17);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray19, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 32, 97]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, 97);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        java.lang.Class<?> wildcardClass11 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 10, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, (int) ' ', 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) ' ');
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray17, 0, (int) (byte) -1, 0);
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray21, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray21, 97, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0, -1]");
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 35);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = intArray16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 100, 100);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray16, (int) 'a', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 52, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray9, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) '4', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (byte) 1, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, 1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, 52, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray7, (int) (byte) 100, 35, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -11");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 100);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray1, 0, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 35);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray6, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (byte) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray7, (int) (byte) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = intArray17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray5, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 100]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray5, 0, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -7");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', 1);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass16 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray17, 52, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 10, (int) (short) 100);
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.others.BFPRT.bfprt(intArray16, 35, 97, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 37 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.getMedian(intArray5, 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray12, (int) (short) 1, 97, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray5, 52, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0]");
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 35);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, (int) (byte) 0, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '#', (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 32);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray15, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 32, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.bfprt(intArray16, (int) (byte) -1, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32]");
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 10);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray4, (-1), 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 0, 0, (int) (short) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (-1), 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray6, 1, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '#');
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 0, 0, 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) (byte) -1, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray2, 32, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 1, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray22, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 35);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        java.lang.Class<?> wildcardClass15 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray17);
        java.lang.Class<?> wildcardClass19 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray21, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32]");
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray7, 1, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 32]");
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        java.lang.Class<?> wildcardClass6 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 32, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, 97, 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray10, 100, (int) (byte) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray11, 52, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -7");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0]");
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (short) 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.bfprt(intArray6, 52, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray11, 97, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (byte) 100, (int) (short) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -16");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 32]");
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray9, 97, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray13, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '4');
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        java.lang.Class<?> wildcardClass14 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (byte) 1, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (byte) 0, 1, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (byte) 1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) (short) 0, (int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray7, 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 0, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) (byte) -1, (int) (byte) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray18, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray11, 10, (int) (byte) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1, 10, 1]");
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) 1, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, (int) 'a', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, 1, (-1));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (byte) -1, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 32);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray17, 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = intArray8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) (byte) -1, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray19, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (-1), (int) ' ');
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) (short) 100, (int) (byte) 100, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 10, 1]");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray5, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 35, 52]");
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (byte) -1, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 1);
        java.lang.Class<?> wildcardClass11 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, (int) 'a', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, 10, (int) '#');
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray19, (int) (short) 10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32]");
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 55 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) ' ', (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (short) 10, 97, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (-1), 97, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray16, (int) (byte) 100, (int) (byte) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) (short) 100, 35, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -11");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) (short) 0, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.bfprt(intArray16, 1, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray17, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 55 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 97);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (short) -1, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray1, 100, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) 'a');
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 0, (int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, 32, (int) (short) 100);
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray1, 0, 35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2768");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
        int int24 = com.thealgorithms.others.BFPRT.getMedian(intArray20, (int) (short) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2769");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
    }

    @Test
    public void test2770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2770");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        java.lang.Class<?> wildcardClass22 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2771");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray16, (int) (short) 0, 32, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2772");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray8, (int) (byte) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2773");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test2774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2774");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray1, (int) '4', (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
    }

    @Test
    public void test2775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2775");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray4, 10, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
    }

    @Test
    public void test2776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2776");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2777");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2778");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray8, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
    }

    @Test
    public void test2779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2779");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, (-1), (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test2780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2780");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (short) 0, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2781");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (byte) 1, 0, (int) (short) 1);
        int int22 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) (short) 0, 0, (int) '#');
        int[] intArray24 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(intArray24);
    }

    @Test
    public void test2782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2782");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) 'a', (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
    }

    @Test
    public void test2783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2783");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 1, (int) (short) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 10, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test2784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2784");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, 35);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2785");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) (short) -1, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
    }

    @Test
    public void test2786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2786");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 10, (int) (short) 100);
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray16, (int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2787");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray19, (int) (byte) -1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.getMedian(intArray19, (int) (byte) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
    }

    @Test
    public void test2788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2788");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 10, (int) '4');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) ' ', (-1), 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test2789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2789");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 0, 0, 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2790");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2791");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray5, 0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test2792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2792");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (-1), (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray6, (int) (short) -1, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
    }

    @Test
    public void test2793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2793");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray7, (int) 'a', (int) (byte) 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
    }

    @Test
    public void test2794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2794");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -7");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
    }

    @Test
    public void test2795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2795");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, 10);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2796");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2797");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) '4', (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 54 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2798");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) 1, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray15, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test2799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2799");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2800");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (byte) -1, (int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test2801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2801");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray8, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
    }

    @Test
    public void test2802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2802");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2803");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray10, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2804");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray7, (int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test2805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2805");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray6, (int) ' ', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test2806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2806");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, 32, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2807");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray17, (int) (short) -1, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
    }

    @Test
    public void test2808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2808");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 35);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass19 = intArray18.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test2809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2809");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2810");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, 35, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2811");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray7, (int) (short) 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 1, 10]");
    }

    @Test
    public void test2812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2812");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray10, 35, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test2813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2813");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (byte) 10, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2814");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.swap(intArray8, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray8, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
    }

    @Test
    public void test2815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2815");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (short) 0, 97);
        com.thealgorithms.others.BFPRT.swap(intArray8, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray8, 52, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0]");
    }

    @Test
    public void test2816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2816");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        java.lang.Class<?> wildcardClass13 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2817");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray7, (int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 32]");
    }

    @Test
    public void test2818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2818");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (int) (byte) 10, 0);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, 32);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 52);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2819");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray10, (int) (byte) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 1]");
    }

    @Test
    public void test2820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2820");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
    }

    @Test
    public void test2821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2821");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (short) 0, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0]");
    }

    @Test
    public void test2822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2822");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) -1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test2823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2823");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2824");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray3, 1, 1, 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray21, (int) (short) 10, 32);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test2825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2825");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100]");
    }

    @Test
    public void test2826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2826");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 1, (int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -16");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
    }

    @Test
    public void test2827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2827");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2828");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2829");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
    }

    @Test
    public void test2830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2830");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray10, 97, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 10, 1]");
    }

    @Test
    public void test2831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2831");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 32, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2832");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2833");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
    }

    @Test
    public void test2834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2834");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 35, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (byte) 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, 0, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2835");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.others.BFPRT.partition(intArray19, (int) (byte) 1, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
    }

    @Test
    public void test2836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2836");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) 'a', 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test2837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2837");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, 35, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2838");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) ' ');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 100, (int) (short) 100);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
    }

    @Test
    public void test2839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2839");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2840");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray7, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test2841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2841");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 10, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 35, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 37 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2842");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -11");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2843");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) 'a');
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (byte) 10, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2844");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) ' ', (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
    }

    @Test
    public void test2845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2845");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2846");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) ' ');
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, 100, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, 97, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.others.BFPRT.getMedian(intArray18, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
    }

    @Test
    public void test2847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2847");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 1, (int) (byte) -1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray14, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test2848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2848");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2849");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2850");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, 100);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray16, 32, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2851");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray15, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test2852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2852");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray7, (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 55 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2853");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
    }

    @Test
    public void test2854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2854");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2855");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (short) 0, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray4, 35, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2856");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test2857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2857");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2858");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2859");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 10, (int) (short) 100);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        com.thealgorithms.others.BFPRT.swap(intArray5, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray5, 10, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2860");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) 'a');
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 0, (int) (short) 0, (-1));
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2861");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2862");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, 52, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test2863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2863");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray13, (int) '#', (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -7");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test2864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2864");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray8, 0, (-1), 10);
        java.lang.Class<?> wildcardClass13 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2865");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray9, 0, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2866");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 10);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2867");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.getMedian(intArray4, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
    }

    @Test
    public void test2868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2868");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test2869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2869");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.BFPRT.bfprt(intArray0, (int) 'a', (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -11");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2870");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 100, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray13, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test2871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2871");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray16, 1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        java.lang.Class<?> wildcardClass20 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2872");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 100);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2873");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test2874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2874");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) '#', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 37 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test2875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2875");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) ' ', 35);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray21, (int) (short) 10, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
    }

    @Test
    public void test2876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2876");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        java.lang.Class<?> wildcardClass12 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2877");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray11, 32, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1, 10, 1]");
    }

    @Test
    public void test2878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2878");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray9, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
    }

    @Test
    public void test2879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2879");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray2, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
    }

    @Test
    public void test2880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2880");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) ' ', (int) '#', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2881");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray17, 35, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 37 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test2882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2882");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.getMedian(intArray18, (int) (short) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 32, 97]");
    }

    @Test
    public void test2883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2883");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray9, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test2884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2884");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray14, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0]");
    }

    @Test
    public void test2885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2885");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2886");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test2887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2887");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 97);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2888");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray14, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2889");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray9, 32, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2890");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, (int) (byte) 1, (int) '#');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
    }

    @Test
    public void test2891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2891");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, (int) (byte) 10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, 100, (int) (short) 1);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray15, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2892");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
    }

    @Test
    public void test2893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2893");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 10, (int) (byte) -1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2894");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray9, 97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2895");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 32);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray8, 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test2896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2896");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 0);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray17, 35, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test2897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2897");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (byte) 1, (int) (short) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray7, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2898");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) 'a', 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2899");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) (byte) 1, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test2900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2900");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, 35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -3");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test2901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2901");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, (int) (byte) 10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
        java.lang.Class<?> wildcardClass18 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2902");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray10, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 1, 10]");
    }

    @Test
    public void test2903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2903");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (short) 100, (int) '#', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
    }

    @Test
    public void test2904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2904");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) ' ');
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 35);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray5, 10, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 35, 52]");
    }

    @Test
    public void test2905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2905");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) (byte) 0, 0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, (int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2906");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray6, 35, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 68 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2907");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, 1);
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) '4');
        java.lang.Class<?> wildcardClass23 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(intArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2908");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2909");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 32, 35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
    }

    @Test
    public void test2910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2910");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray2, 1, (int) (short) 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray19, (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[2, 1]");
    }

    @Test
    public void test2911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2911");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 0, 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) (byte) 0, (int) (short) 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0, 100]");
    }

    @Test
    public void test2912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2912");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (-1), (int) (byte) -1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 32);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2913");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) ' ');
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.bfprt(intArray21, 100, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -20");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
    }

    @Test
    public void test2914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2914");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 100, (int) '#', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -11");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2915");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '#', (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 0, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2916");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) ' ');
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        int int24 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) ' ');
        int[] intArray26 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) (byte) 1);
        int[] intArray27 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray27, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1]");
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1]");
    }

    @Test
    public void test2917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2917");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '4');
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray15, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2918");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 0, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) (byte) 1, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2919");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test2920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2920");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray16, 1);
        java.lang.Class<?> wildcardClass19 = intArray16.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2921");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, (int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2922");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 35, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.bfprt(intArray1, (int) (byte) -1, (int) (byte) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test2923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2923");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) (byte) 0, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2924");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (short) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2925");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.swap(intArray11, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[97, -1, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test2926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2926");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.getMedian(intArray6, 97, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test2927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2927");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.swap(intArray11, (int) (short) 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) '#', 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
    }

    @Test
    public void test2928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2928");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) ' ');
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, 100, (int) 'a');
        int[] intArray29 = com.thealgorithms.others.BFPRT.partition(intArray18, 0, (int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass30 = intArray29.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0]");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test2929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2929");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 1);
        java.lang.Class<?> wildcardClass10 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2930");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray18, (int) (short) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
    }

    @Test
    public void test2931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2931");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 97);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray8, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1]");
    }

    @Test
    public void test2932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2932");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray3, 32, (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2933");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray8, (int) 'a', (int) (byte) 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test2934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2934");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (int) (short) -1, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
    }

    @Test
    public void test2935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2935");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (-1), (int) (byte) -1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (short) 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) -1);
        java.lang.Class<?> wildcardClass20 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2936");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2937");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) -1, (int) (byte) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2938");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) (byte) -1, 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32]");
    }

    @Test
    public void test2939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2939");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray6, 97, (-1), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2940");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test2941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2941");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) ' ');
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, (int) (short) 100, 97);
        int[] intArray26 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray26, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[-1]");
    }

    @Test
    public void test2942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2942");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray5, 32, (int) (short) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2943");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray16, 0);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.bfprt(intArray16, (int) (short) 1, 97, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test2944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2944");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 1, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test2945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2945");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        java.lang.Class<?> wildcardClass15 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2946");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (byte) -1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray13, 0, (int) (short) -1, (int) (byte) 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray19);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray19, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1]");
    }

    @Test
    public void test2947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2947");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2948");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) ' ');
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test2949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2949");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) ' ', (int) '#', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2950");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, (int) (byte) 1, (int) (byte) 100);
    }

    @Test
    public void test2951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2951");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 32);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray17, 0, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test2952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2952");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) ' ', 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2953");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, 35, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2954");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -12");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test2955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2955");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray6, 52, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2956");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2957");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 10);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray2, 10, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2958");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray5, 52, 35, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test2959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2959");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 0, 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray10, 32, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 35, 52]");
    }

    @Test
    public void test2960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2960");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray3, 1, 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
    }

    @Test
    public void test2961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2961");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0]");
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test2962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2962");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, 52, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test2963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2963");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (byte) 10, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test2964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2964");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 100, 100);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 32);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2965");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) (short) 100, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
    }

    @Test
    public void test2966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2966");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.swap(intArray2, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) (byte) 0, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2967");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) ' ', (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) '4', 32);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray9, 35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 23 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2968");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 35, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 1, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
    }

    @Test
    public void test2969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2969");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 10, (int) (short) 100);
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray16, 32, (int) 'a', 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test2970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2970");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.bfprt(intArray14, 97, (int) (byte) 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -16");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
    }

    @Test
    public void test2971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2971");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 32);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (short) 1, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test2972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2972");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 97, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 48 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2973");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 0);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 100);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2974");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray14, 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test2975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2975");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray9, 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 32, 97]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2976");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) 'a');
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) 10);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray19);
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray20, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = com.thealgorithms.others.BFPRT.partition(intArray20, (int) (short) 1, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2977");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 10);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray2, (int) ' ', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test2978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2978");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray9, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test2979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2979");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (-1), 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test2980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2980");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, 32, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2981");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 100);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2982");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, 32, (int) '4');
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray16, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray21, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32]");
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test2983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2983");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray14, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test2984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2984");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
    }

    @Test
    public void test2985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2985");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray4, 100, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2986");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2987");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray7, (int) (short) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray7, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test2988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2988");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) '4', (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test2989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2989");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray7, (int) (byte) -1, (int) (short) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2990");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, (int) (short) -1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test2991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2991");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) ' ');
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray8, (int) (short) 10, 35, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2992");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
    }

    @Test
    public void test2993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2993");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test2994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2994");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray9, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
    }

    @Test
    public void test2995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2995");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (byte) 1);
        int int9 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (short) -1, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2996");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 32);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test2997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2997");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 100, (int) (short) 0);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (byte) 100, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2998");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray15, 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 17 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test2999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2999");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (short) -1, (int) (short) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
    }

    @Test
    public void test3000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test3000");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray11, 97, (int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(intArray16);
    }
}
