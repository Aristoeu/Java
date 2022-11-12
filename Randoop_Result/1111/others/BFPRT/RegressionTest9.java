package others.BFPRT;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
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
            int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray9, (int) '4', (-1));
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
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
        int[] intArray26 = com.thealgorithms.others.BFPRT.partition(intArray20, 1, 1, 1);
        int[] intArray30 = com.thealgorithms.others.BFPRT.partition(intArray26, 1, 0, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray30, (int) (short) 100, 32);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0]");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray10, 35, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray13, 32, 97, (int) (byte) 10);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray13, (-1), (int) (byte) 1, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
            com.thealgorithms.others.BFPRT.swap(intArray15, (int) (short) -1, (int) (short) 1);
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
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) -1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray5, 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (short) 1, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (-1), (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, (int) (short) 1, (int) (short) 10);
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
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 10, 0);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (byte) -1, (int) (byte) 0, (int) (byte) 100);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray10, 52, (int) 'a', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) 'a');
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
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (int) '#', (int) '4', (int) (short) 0);
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
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) -1, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (int) (short) 0, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 52);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, 0, (int) (short) 0);
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
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, 32, 1);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 1, (-1));
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 52);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 0, (int) (short) 100);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, 97);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray8, (int) (short) -1, 0);
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
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 10, (int) (short) 100);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray5, 32, 97, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) '#');
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
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (byte) 100, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray17, (int) 'a');
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
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 97);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (-1));
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (byte) 100, 0);
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
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 52);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) 'a');
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) ' ', 1, 35);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) -1);
        int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (short) 0, (int) (byte) 1);
        int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray3, 0, 1, 0);
        int int23 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (int) ' ', (int) (byte) 100);
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
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 0, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, (int) '4', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.others.BFPRT.partition(intArray14, 52, (int) (byte) 100, 0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, (int) (short) 10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
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
        int[] intArray29 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.others.BFPRT.getMedian(intArray29, (int) (byte) 10, 52);
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
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 0, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray11, 97, 0, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) ' ');
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray17, 35);
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
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.swap(intArray9, 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[97, -1, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (byte) 10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (byte) 100, 10);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (-1), (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray12, 100, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
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
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.others.BFPRT.bfprt(intArray18, 100, (int) (short) 10, (int) '4');
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
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        int[] intArray26 = com.thealgorithms.others.BFPRT.partition(intArray20, 1, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray20, (-1), 0);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0]");
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        int[] intArray29 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        int int31 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, 0);
        int int33 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) (byte) -1);
        int[] intArray34 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int38 = com.thealgorithms.others.BFPRT.bfprt(intArray34, 35, (int) (short) 100, 0);
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
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[-1]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[-1]");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
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
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, (int) (short) -1, (int) (short) 10);
        int[] intArray27 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) (short) 10);
        int[] intArray29 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, 32);
        java.lang.Class<?> wildcardClass30 = intArray18.getClass();
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
        org.junit.Assert.assertNull(intArray27);
        org.junit.Assert.assertNull(intArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (-1), (int) '4', 0);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) '4');
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray13, (int) (short) -1, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray5, (int) (byte) 0, 10);
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
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (byte) 0);
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
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = intArray12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.swap(intArray10, (int) (short) 0, 0);
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
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) '4', 10, 100);
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
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray16, 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (byte) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray13, (int) 'a', (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) (byte) 1);
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 97, 32]");
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, (int) '#', (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 0, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 100);
        java.lang.Class<?> wildcardClass17 = intArray14.getClass();
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, (int) (byte) 1, (int) '#');
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
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) '4', (int) ' ');
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
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
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
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, (int) (short) -1, (int) (short) 10);
        int[] intArray27 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) (short) 10);
        int[] intArray28 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        int int30 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray28, (int) (byte) 100);
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
        org.junit.Assert.assertNull(intArray27);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.swap(intArray5, (int) (short) 0, 0);
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
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 100);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 52, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 0, 0, 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, 97, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) ' ');
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        java.lang.Class<?> wildcardClass13 = intArray12.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 100, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (int) (short) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) 'a');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 0);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, 1, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 52, (int) (short) 10);
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
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (short) 100, 35);
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
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
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
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 1, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 0, (int) '#');
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (byte) -1, 52, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.swap(intArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray2, (int) (short) 100, (int) 'a');
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
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 0, (int) (byte) 10);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 52, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) 'a', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
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
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray12, 0, (int) (short) 100, (int) (byte) 100);
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
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) ' ');
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass19 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 1, (int) (byte) 10);
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray14, (-1), (int) '4');
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
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, 1);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) 'a');
        int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (byte) 1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) (byte) 1, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 97);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int23 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray20, 0, 0);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, (-1));
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray14, (int) (short) 0, 52);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
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
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) (short) 1, 97, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        com.thealgorithms.others.BFPRT.swap(intArray1, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100]");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray17, 52, (int) (byte) 0);
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
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
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
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) -1);
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 97);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 32, (int) ' ');
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
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 52);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray1, (int) (byte) 0, 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 35, 100);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray10, (int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 32);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray6, 97, (int) (byte) 100);
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
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) (short) 1, 97, 100);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) (byte) -1, (int) (byte) 0);
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
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (int) (byte) 10, 35, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 32, -1, 35, -1]");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray14, (int) (short) 0, 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 0);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray2, (int) (byte) -1, 35);
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
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, 100, (int) ' ');
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 0);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (-1), 35, 35);
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
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, (int) (short) -1, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, (int) (short) -1, 100);
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (short) 100, (int) '#', (int) '4');
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
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 0, (int) (short) 0);
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) (short) 10, 52, 100);
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
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (short) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (short) 0, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
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
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, (int) (short) 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray10, 10, (int) (short) 0, 97);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray7, (int) '4', (int) (short) 1);
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
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.swap(intArray11, 1, (int) (short) 0);
        int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) (byte) 0, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray11, 52, 97, 52);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray5, (-1), (int) (byte) 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
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
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray17);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray18, (int) '#', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10]");
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 0);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray19, (-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
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
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) ' ', (int) (short) -1);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) ' ');
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 35);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32, 35, 52]");
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray16, (int) (short) -1, 35);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray6, 97, 10);
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
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
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
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (byte) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 35);
        java.lang.Class<?> wildcardClass19 = intArray13.getClass();
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
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, (int) (short) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
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
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray12, (int) (byte) 0, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray16, 35, 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0]");
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, (int) (byte) 0, 10);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 32);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (int) ' ', 35);
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
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (-1), 100);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) '#');
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray21, (int) (byte) 100, 32);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 10, 32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) -1, (int) (byte) 10, 32);
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
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
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
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) (byte) 0);
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) (byte) 0);
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
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 10]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray11, 32, (int) (short) 10, (int) (byte) -1);
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
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, 97, 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, 52, 0);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, (-1), 1);
        java.lang.Class<?> wildcardClass14 = intArray10.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, 0, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100]");
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.bfprt(intArray21, (-1), (int) (short) -1, 10);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32]");
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (int) ' ', (int) (short) -1, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 10, (int) (short) 100);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 52, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, (int) (byte) 100, 1);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 52);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, 35, (int) 'a');
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) (short) 100);
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
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (short) 1);
        int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray16, 0, 0, 0);
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray21, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.others.BFPRT.bfprt(intArray21, 100, 35, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -11");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass16 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '#');
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
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
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
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, (int) '4', 35, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) (short) 10);
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
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray4, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -10");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, (int) (byte) -1, (int) ' ');
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
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 35, 10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray14, 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 10, (int) (byte) 10);
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
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 32, -1, 35, -1]");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, 35, 1);
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
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
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
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (short) 1, (int) (short) 100);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.swap(intArray16, 0, 0);
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
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) -1);
        int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 1, (int) (short) -1);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 10);
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray9, 1, (int) (short) 1, 10);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray10, 0, (int) (byte) 0, (-1));
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 10, 1]");
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 35);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray4, (int) '#', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 0, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass16 = intArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) (byte) 0, 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) '#', (int) (byte) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
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
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (-1));
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
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, 35, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 52, (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
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
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (short) 0, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '#');
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 32, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) -1, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
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
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.getMedian(intArray20, 97, (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray9, 0, (int) (byte) 0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (byte) 1, (int) (short) -1, 1);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0]");
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, (-1), 35);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, 0, 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 97, (int) (short) -1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, (int) (short) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (short) -1, (int) (byte) 10);
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray20, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) (short) 1, 1, 52);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) (short) -1, 0, 100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', 1);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray16, (int) (short) 100, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray17);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, 97);
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray17, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) '4', (int) (short) 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, (int) 'a');
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray4, (int) '#', 0);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 52);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) (byte) 100, 0);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 32);
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
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, 35, (int) '4');
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
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32]");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 32);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 10);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, 1, (int) (short) 10);
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
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        int[] intArray1 = new int[] { (short) 10 };
        int[] intArray3 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = com.thealgorithms.others.BFPRT.partition(intArray3, 10, 35, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[10]");
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray14, 0, (int) (short) 0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
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
            com.thealgorithms.others.BFPRT.swap(intArray2, (int) 'a', (int) (byte) 1);
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
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
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
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (byte) 100, (int) (byte) 1, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        int[] intArray0 = null;
        int[] intArray2 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, 1);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) 'a');
        int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (byte) 1, (int) (short) 1);
        int[] intArray25 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNull(intArray25);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        int[] intArray5 = new int[] { 0, 1, (byte) 0, (-1), 100 };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, 1, (int) (byte) 1, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray5, 0, 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 0, -1, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
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
            com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) -1);
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
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, 35, 0);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.swap(intArray11, (int) (short) 1, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray20, 32, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray8, (int) (byte) 1, 97, (int) (byte) 10);
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
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) '4', 1);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
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
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (short) 1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, (-1), (int) (short) 0);
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
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 1, 0, (int) (short) 100);
        int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray3, 52, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        com.thealgorithms.others.BFPRT.swap(intArray2, (int) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 100, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '#', (int) (byte) 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (byte) 1, 0, 97);
        com.thealgorithms.others.BFPRT.swap(intArray16, (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.bfprt(intArray16, 52, 0, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, 1]");
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 0);
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray23 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
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
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (byte) -1, (int) (short) 1);
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
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray19);
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
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray11, 1, 35, 100);
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
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 100, 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
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
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 100, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = intArray14.getClass();
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
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
        int[] intArray23 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[0]");
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) ' ', (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -6");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 100, (int) (short) 0);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 100);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray1, 0, (int) (short) -1, (int) (byte) 100);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
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
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray4, (-1), 0, (int) ' ');
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
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (byte) 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (byte) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) -1);
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
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 32);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 52, (int) (short) 10, 10);
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
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 0, 0, 10);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 100);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, (int) '#', (int) '4');
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray15, (int) ' ');
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
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, (-1), (int) (short) 10);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, 0, 32);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray16, 1, 0, 0);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (byte) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) ' ', (int) (byte) 0, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) -1, 35);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 0, (int) (short) 0);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 52, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, (int) (byte) 100, 97);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (byte) 1, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 35, 52]");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
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
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray13, 10, (int) '#', (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) (short) 1, 52, (int) (byte) -1);
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
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (-1), 0, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, 1, 35);
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
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) -1);
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
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (-1));
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray7, (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 0);
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
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 35, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (-1), (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) (short) 10, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0]");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, (int) (short) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 100);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) (byte) 1);
        int[] intArray24 = com.thealgorithms.others.BFPRT.partition(intArray18, 0, 1, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0]");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) -1);
        int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 1, (int) (short) -1);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 10);
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, (int) (short) 100);
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
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) 'a', (int) (byte) 0, 52);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 97);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 97);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (byte) 100, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
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
        java.lang.Class<?> wildcardClass19 = intArray18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, 10, 100);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, 1, 1);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, 100, (int) ' ');
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 10, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) 'a');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray16, (int) '4', 0, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, 97, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, (int) (short) 100, (-1));
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
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.getMedian(intArray16, (int) '#', (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray14, (-1), (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32, 35, 52]");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) -1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[100, 0]");
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
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
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray17);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray18, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -16");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10]");
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
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
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray2, 35, (int) (short) 0, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 10, (int) (short) 100);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (int) '4', (int) '4');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (-1), (int) (byte) -1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray12, (int) (byte) 10, 32, 35);
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
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
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
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (byte) 100);
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
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
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
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) (byte) -1, 52, 0);
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
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 35, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, (int) '#');
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
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (-1), (int) (short) 10);
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
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray1, (int) (short) 1, (int) (byte) -1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (short) -1, 0);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0]");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray15, 0, (int) (byte) 0, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray7, (-1), 35);
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
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) '#', (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) '#', (-1));
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) ' ', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
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
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray20, 97, 0);
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
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray8, (int) ' ', (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray1, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray6, (int) (byte) 100, 35);
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
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray2, 97, (int) (byte) 0, (int) (short) -1);
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
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100, 0]");
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 100, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray5, 1, (int) (short) 100);
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
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, (int) 'a', 52);
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) ' ', (-1), (int) (byte) -1);
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
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) ' ', (int) (short) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) -1);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (short) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray13.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray0, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) ' ');
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
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
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
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray20, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.getMedian(intArray20, 35, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 1, (-1));
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 52);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) '#', 0);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray8, (int) '4', (int) (byte) 0, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 1, 10]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 52, (-1));
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
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 52, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, (-1), 0);
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
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (-1), 100);
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
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray3, 10, (int) '#', (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray8.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (int) (short) 1, (int) (byte) 10);
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
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) '4');
        int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray15, (-1), 1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (short) 1, (int) (byte) 100, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 10);
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
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
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
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray16, 35, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray19, 0);
        int int23 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray19, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.others.BFPRT.bfprt(intArray19, (int) (byte) 100, (int) (short) 0, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (int) (short) 0, 100, 1);
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
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 97);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 10, 10);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 1, (int) (short) 0, 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) ' ', (int) '#', (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, (-1));
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) '#', (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) (byte) 10, (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, 0, 32);
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
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
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
        int int24 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 97);
        int int26 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 32);
        int[] intArray31 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(intArray31);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray8, (int) (byte) 10, (int) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 52, (int) (byte) 1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray4, 35, (int) '#', (int) '4');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 100);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) '4', (int) (byte) 100, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 0, (int) (byte) 1);
        int[] intArray25 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray25, (int) '4', 97);
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
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[0]");
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (-1), (int) (short) 100);
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
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray10, 0, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) (byte) 1, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.swap(intArray10, 0, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray16, (int) (short) 100, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 10, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 0, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray14, (int) (byte) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 97, 32]");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) (byte) 10, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, 100, (int) (byte) -1, (int) (byte) 10);
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
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
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
            com.thealgorithms.others.BFPRT.swap(intArray16, 52, 10);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
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
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) ' ', (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) (byte) 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (int) (byte) 10, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, 100, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray6, 97, (int) ' ', (int) (short) 10);
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
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray10.getClass();
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        java.lang.Class<?> wildcardClass10 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        java.lang.Class<?> wildcardClass5 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, (int) (short) -1, 100);
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 32, -1, 35, -1]");
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
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
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, (int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray17, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, 35, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.BFPRT.bfprt(intArray0, (int) (short) -1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '4');
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray15, 97, (int) ' ');
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
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, 1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray18, (int) (short) -1, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (byte) 1);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, (int) (byte) 10, 100);
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
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 52, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 0, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) '#', 0, 32);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 10);
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 32);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
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
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, 1);
        com.thealgorithms.others.BFPRT.swap(intArray11, (int) (byte) 0, 0);
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        int int26 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, 0, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray0, 32, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, 1, 35);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 10]");
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, (int) (short) 1);
        int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, 10, (int) (byte) 1);
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
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) (short) 10, 97, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.bfprt(intArray6, (int) (byte) 100, (int) (byte) 100, 35);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
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
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 100, (int) 'a');
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
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) (byte) -1, 0);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) '#', (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
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
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray16, 52, (int) '#', (int) '#');
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 0, (int) (byte) 10);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) (byte) -1, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 100, 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 52);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
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
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) '#', 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray15, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 100, 35);
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
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) '4');
        java.lang.Class<?> wildcardClass22 = intArray1.getClass();
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
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 100, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) '4', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
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
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray12, (int) (byte) 0, (int) '4', (int) (short) 1);
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
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray13, (int) (short) -1, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray5, (int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray1, (int) '4', 10);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray7, 1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[32, 35, 52]");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (short) 0, 1);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[35, 32, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, 97, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -19");
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
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, (int) (byte) 100, (int) ' ');
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
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray17, 97, 10, 1);
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
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', 100);
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
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
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
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = com.thealgorithms.others.BFPRT.partition(intArray22, (int) (byte) 1, (-1), (int) (short) -1);
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
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray7, (int) (byte) 1, 0);
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (short) -1, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 32, 32);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray16, 32, (int) (byte) 0);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 100, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray15, (int) (short) -1, (int) (byte) 0);
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
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 97);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) (short) 100, 32);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.getMedian(intArray6, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertNull(intArray6);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray13, (int) (short) 10, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 0);
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
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) '#', 32);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray19);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 100, (int) '4', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -8");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray15, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -6");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 32);
        int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 0, (int) (short) 0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0]");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) '4', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) '#', 1, 97);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray8, (int) (short) 1, (int) (byte) 100, 0);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 100);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) 'a');
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.bfprt(intArray1, 97, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
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
            int int21 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 100, 0);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, (int) (byte) -1, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, 35);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 35);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, 52, (int) ' ');
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
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray13, (int) (byte) 0, 1);
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
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, 52);
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
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) -1, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) (byte) 10, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 1, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray3, 0, 0, (int) (byte) 100);
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, 32, (int) (byte) 1);
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
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) -1, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray6, (int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -16");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1]");
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, (int) (short) 10, 32);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.swap(intArray12, 0, 0);
        java.lang.Class<?> wildcardClass16 = intArray12.getClass();
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
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
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray16, 32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray16, (int) (byte) 0, (int) (byte) 10, 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) '4', 1);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 100]");
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) ' ', 1);
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
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
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
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 100);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray1, (int) (short) -1, (-1), (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray6, (int) (byte) 100, 0);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, (int) (byte) -1, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray15, 32, (int) (byte) -1);
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
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray17);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, (int) (short) -1, 0);
        int int24 = com.thealgorithms.others.BFPRT.getMedian(intArray18, (int) (byte) 0, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) (byte) 100, 97, (int) '4');
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
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, 100, (int) ' ');
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (byte) 1, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) (byte) -1, (int) '#');
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
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
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
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.swap(intArray12, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray12, 32, 0);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (-1), 0);
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
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 100, (int) (short) 0);
        java.lang.Class<?> wildcardClass14 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 32, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) (byte) 0);
        int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) (short) 0, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 1, (-1), 35);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 100);
        java.lang.Class<?> wildcardClass8 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) ' ', 97);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
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
            int int27 = com.thealgorithms.others.BFPRT.getMedian(intArray16, (int) (byte) 1, (int) (short) 0);
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
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) 'a', (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray13, 0, (int) '#', (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
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
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray18, (int) (short) -1, (int) (short) 0);
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
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
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
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray16, 10, (int) (short) 0, 52);
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
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray15, 97, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, 97);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, (-1), 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, (int) (byte) 1, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, 100, 10);
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
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 32);
        java.lang.Class<?> wildcardClass12 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray5, 0, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray5, 35, (int) (short) 100, 52);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0]");
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 32);
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
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
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
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 1, (-1));
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) (short) 100, 32);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.BFPRT.bfprt(intArray0, (int) (short) -1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, 32, 10);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
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
        int[] intArray26 = com.thealgorithms.others.BFPRT.partition(intArray20, 1, 1, 1);
        int[] intArray30 = com.thealgorithms.others.BFPRT.partition(intArray26, 1, 0, 97);
        int[] intArray32 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray26, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0]");
        org.junit.Assert.assertNull(intArray32);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray10, (-1), (int) (byte) 0, (int) '4');
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
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
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
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, (int) (byte) 1, (int) (short) 100, 52);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (-1));
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) '4', 97);
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
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 52, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
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
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray9, 10, (int) ' ', 0);
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
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
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
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray14, 35, 97, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray16, (int) (byte) 10, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
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
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, -1, 10, 1]");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 10, (int) (short) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 32);
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
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, 0, (-1), (int) '#');
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, -1]");
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, 1);
        com.thealgorithms.others.BFPRT.swap(intArray11, (int) (byte) 0, 0);
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        int[] intArray24 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray26 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 35);
        int int28 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray9, 52, 0);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (byte) 0, 35);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 1]");
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 0);
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 35);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray21, (int) (byte) 0, (int) ' ', 0);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray9, 97, (int) (byte) 100, (-1));
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
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) -1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 1, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
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
        int[] intArray23 = com.thealgorithms.others.BFPRT.copyArray(intArray22);
        java.lang.Class<?> wildcardClass24 = intArray22.getClass();
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray15, 52, 52);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray12, (int) (short) -1, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, -1, 10, 1]");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 0, (int) '#');
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (-1), (int) (byte) 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray13, (int) ' ', (int) '4');
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
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
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) '4');
        int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray8, 0, (int) (byte) -1, (-1));
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, -1]");
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray2 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray2, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray9, (int) (byte) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int10 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray2, (int) (short) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) ' ');
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 52);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (short) 1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
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
            int int22 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) (short) 1, (int) (byte) 10, 0);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 0, (int) (byte) 10);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 35, (int) (short) -1);
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
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, 52);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 1, (int) 'a');
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
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '#', (int) (byte) 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (byte) 1, 0, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray16, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, 35, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 10, (int) (short) -1, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }
}

