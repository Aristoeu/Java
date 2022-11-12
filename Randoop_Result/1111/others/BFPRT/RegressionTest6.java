package others.BFPRT;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
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
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
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
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
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
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
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
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
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
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
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
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 1, 97);
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
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
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
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
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
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
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
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
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
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
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
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
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
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
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
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
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
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
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
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
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
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
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
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
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
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
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
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
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
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
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
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
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
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
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
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
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
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
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
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
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
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
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
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
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
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 10, (int) (byte) 100);
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
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
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
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
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

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (byte) 100, 10, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, (int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, 97, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, (int) (byte) 10, (-1));
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
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray7, 52, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 100, 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 35);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100, 0]");
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 100, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, (int) (byte) 100, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 32);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (byte) 0, (int) '#', 35);
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
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
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
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) (byte) 100, 0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        java.lang.Class<?> wildcardClass8 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, (int) (short) 10, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
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
        int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray12, (int) (short) 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.bfprt(intArray12, (int) (byte) 10, (int) (short) 10, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 100);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 1);
        java.lang.Class<?> wildcardClass12 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 0, 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, 0);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 35, 52]");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[32, 35, 52]");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (int) (short) 1, 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (short) 1, (int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) '#', 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
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
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) -1, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray6, (int) (byte) 100, (int) '#');
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
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 100);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray1, (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16 out of bounds for length 1");
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
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray7, (int) (byte) -1, (int) (short) 10, (int) '#');
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
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
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
            int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) '4', (int) (byte) -1, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 1, 97);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
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
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.bfprt(intArray18, (int) '4', (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 54 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        int[] intArray4 = new int[] { (byte) 10, (byte) 100, '#', ' ' };
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMedian(intArray4, (int) (short) 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 35, 32]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        int int24 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = com.thealgorithms.others.BFPRT.partition(intArray1, (-1), (int) (byte) 0, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, 1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass19 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray17, (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (short) 0, (int) (byte) 0, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) -1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray5, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 1");
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
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray5, 35, (-1));
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray7, (int) '#', (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
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
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.swap(intArray11, (int) (short) 1, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
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
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
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
            com.thealgorithms.others.BFPRT.swap(intArray14, 35, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) '4');
        java.lang.Class<?> wildcardClass4 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNull(intArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 35);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray14, 0, (int) '4', 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray10, (int) (byte) 100, 0);
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
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) -1, (int) (byte) 10, 0);
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
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray7, 35, (int) (byte) 10, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (short) 0, 97);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray9, 35, 35, 10);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 35, 52]");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray3, 1, 1, 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray17, 10, (int) '4', (int) '4');
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (-1), (int) '#', (-1));
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
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = intArray12.getClass();
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
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, 0, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) (short) -1, 97, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
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
        int[] intArray28 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray26, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.others.BFPRT.bfprt(intArray26, (int) '#', 10, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0]");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[100]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
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
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) (byte) 0, 52);
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
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, 52, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
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
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray14, (int) (short) 10, (-1));
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
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray5, 35, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.BFPRT.bfprt(intArray0, 97, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -11");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 10, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) -1, 32, 32);
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
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
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
        java.lang.Class<?> wildcardClass20 = intArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray7, (int) (byte) 0, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (short) 0, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -8");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) (byte) 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, 32, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray1, (int) (byte) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -12");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray10, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 66 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) (short) 0, (int) '4', 100);
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
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray17, 100, (int) ' ', 10);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
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
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray18, 32, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
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
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, 32);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) (short) 100, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -12");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 35, 52]");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, (int) (byte) 10, (int) '#');
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
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray1, (int) ' ', (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 34 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 35, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (byte) -1, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray17, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
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
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 0);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 100);
        java.lang.Class<?> wildcardClass13 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (short) 0, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', (int) (short) 10);
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
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
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
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
            com.thealgorithms.others.BFPRT.swap(intArray15, 10, (int) 'a');
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
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
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
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, (int) (short) -1, (int) (byte) 100, (int) (byte) 0);
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
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (byte) 100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -8");
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
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray1, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 99 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 1, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, (int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, 35, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) '#', (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
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
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 32, (int) ' ', 0);
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
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 10);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (int) (byte) 1);
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
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray7, (int) 'a', (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -19");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 32);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 10, (int) '#');
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
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray7, (int) 'a', 97, (int) (short) 10);
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
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, 32, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray17, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
            int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 52, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 1");
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
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) -1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray2, (int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray3, (-1), (int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 1, (int) '#');
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
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (-1), 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray6, (int) (short) 0, (int) (short) 10, (int) (byte) 1);
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
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, 97);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, (int) '#', (int) ' ');
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) 1);
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
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) ' ', 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray4, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 49 out of bounds for length 1");
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
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
            com.thealgorithms.others.BFPRT.swap(intArray11, 35, (int) (short) 10);
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
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) '4', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
            com.thealgorithms.others.BFPRT.swap(intArray16, 35, 97);
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
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
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
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, (-1), (int) (short) 10, 1);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
            int int24 = com.thealgorithms.others.BFPRT.getMedian(intArray21, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 1");
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
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray17, 0, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray7, (int) (byte) 0, 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray7.getClass();
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray1, (-1), 52, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (short) 0, 97);
        com.thealgorithms.others.BFPRT.swap(intArray8, 0, 0);
        com.thealgorithms.others.BFPRT.swap(intArray8, 0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 1]");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '4');
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 10);
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
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 0, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (byte) 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 97]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 97);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (byte) 10, (int) (short) -1);
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
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
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
            int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray19, 10, (int) '#');
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
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) -1, (int) (short) 1, 100);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray6, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1, 0, 1, 10]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, -1, 10, 1]");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 75 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 1);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (short) 1, 10, (int) '4');
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
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
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
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (byte) -1, (int) (byte) 1, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray7, 97, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 10, 0);
        java.lang.Class<?> wildcardClass14 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 32);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray1, 35, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 37 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 97);
        java.lang.Class<?> wildcardClass16 = intArray13.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray13, 100, (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -20");
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
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.BFPRT.bfprt(intArray0, (int) ' ', (int) (short) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray19, 10);
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray22, (int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 32]");
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) '4', (-1));
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
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, (int) 'a');
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray15, (int) (short) 0, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, 0, 97);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
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
        java.lang.Class<?> wildcardClass26 = intArray18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray19, 10);
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray19);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray19, (int) 'a', 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 32]");
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
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
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) ' ', (int) (short) 10);
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
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[10]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 1, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, 0, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (byte) -1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray13, 0, (int) (short) -1, (int) (byte) 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray19);
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.getMedian(intArray19, 100, 1);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray8, (int) '#', (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -3");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (byte) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = intArray8.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (byte) -1, 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray6, 35, 1, (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray8, (int) (short) -1, 100, 0);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 35, 52]");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) 0, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (byte) 100, (int) '#');
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, (int) '4', (int) 'a');
        int int26 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray17, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.others.BFPRT.bfprt(intArray17, (int) (byte) 1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray24 = com.thealgorithms.others.BFPRT.partition(intArray20, (int) (byte) 0, (int) (short) 1, 0);
        int[] intArray25 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray25, (int) ' ', 35);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1, 97, 32]");
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) (short) 100, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
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
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 35);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 0, (int) (short) 10, 52);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray2, 0, (int) '4', (-1));
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
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray7, 0, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray21, 1, 35);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0]");
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, (int) (short) 1, (int) (short) 1);
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
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 0);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 52);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 1, (int) (short) 0, 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray13, (int) (byte) 0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 51 out of bounds for length 1");
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
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
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
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray23, (int) (short) 100, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray2, 1, (int) (short) 1, 97);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[2, 1]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, 35, (int) (byte) 1);
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
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (byte) 100, 52, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray2, 100, (int) '4', 10);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) (short) 100);
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
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        int[] intArray24 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, (int) (short) 100);
        int int26 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray19, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = com.thealgorithms.others.BFPRT.bfprt(intArray19, (int) (byte) 0, 1, (-1));
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
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray7, (int) (byte) -1, (int) (byte) -1, 1);
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
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 1, 52, (int) 'a');
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
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        java.lang.Class<?> wildcardClass10 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
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
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, 0, 100, (int) (byte) 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 52, (int) (short) -1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) (short) 100, 100, (int) (short) 10);
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
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray13, 1, (int) (short) 100);
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
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
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
            com.thealgorithms.others.BFPRT.swap(intArray16, (int) '4', (int) ' ');
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
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.swap(intArray2, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 100, 100);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, (int) '#', (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
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
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray16, 0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 1, (int) (short) 100);
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
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (byte) 1, (int) '#');
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 1, 0, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (short) 1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) '#');
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, (int) ' ', (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, (int) (short) 1, (int) (short) -1);
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
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 1, 1);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (byte) 10, (int) (short) 100, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, 52, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -10");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
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
            int int23 = com.thealgorithms.others.BFPRT.bfprt(intArray1, 10, (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray10, (-1), (int) (byte) 100);
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
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) (short) 1, (int) (short) 100, 10);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 35, (int) (short) 0);
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) ' ');
        int int23 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (short) 0, 0, (-1));
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
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
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (byte) -1, (int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        java.lang.Class<?> wildcardClass22 = intArray18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 52);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (-1), 97);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (byte) 10, (int) '#', (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 1, (int) (short) 0, 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) '4', (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) 'a', (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) (short) 100, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray3, 0, 0, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) '#', 0);
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
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -10");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, (int) ' ', 32);
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
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (byte) 0, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
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
        java.lang.Class<?> wildcardClass23 = intArray20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
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
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
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
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray15, 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 6 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) (byte) 1, 10, 1);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 1, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 0, 10);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0]");
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 1, (int) (short) 10);
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
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 52);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) 'a', (int) (short) 10, 10);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 0, 0);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) ' ', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (int) (byte) 1, (int) (short) 10);
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
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
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
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.others.BFPRT.bfprt(intArray18, 35, 0, 100);
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
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, (int) (short) 1);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) 'a');
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
            int int23 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray19, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -7");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
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
            int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray17, 0, 35);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0, 100]");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (-1));
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, (int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
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
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray19, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray19, (int) (short) 1, (int) (short) 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 97);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (byte) 0, 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 0]");
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray18, (int) ' ', (int) (byte) 100);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 32]");
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, (int) 'a', (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
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
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray13, (int) (byte) 1, 97);
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
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.swap(intArray2, 0, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 35);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) '4', (int) (short) 0);
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
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray12, 97, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
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
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
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
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray15, (int) '#', (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray8, 100, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -20");
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
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) (byte) 100, 97, (int) (short) 0);
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
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, (-1));
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, 0, (int) (byte) 100);
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
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
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
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        int[] intArray4 = new int[] { (byte) 10, (byte) 100, '#', ' ' };
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read the array length because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 100, 35, 32]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertNull(intArray8);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
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
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray17, (int) (byte) -1, 10, (int) 'a');
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
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 0]");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (byte) 100, (-1));
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) '4', (int) '4');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (byte) 10, (-1));
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
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray14, 10, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32, 35, 52]");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) (byte) 100, 0, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray12, 32, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -6");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 32, 97);
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
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (-1), (int) (short) 0);
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
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 1, (-1));
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 52, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 1");
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
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray11, (-1), (int) (byte) 1, (int) (short) 0);
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
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) (short) 1, (int) (byte) 1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray11, 52, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0, 100]");
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.bfprt(intArray17, (int) (short) 100, 52, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -8");
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
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray15, (int) (byte) 0, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 1, (int) (short) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 97, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) '#');
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, 97, 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 32]");
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray17, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 17 out of bounds for length 1");
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
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray18, 35, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32]");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 100);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) 'a');
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) (short) 1);
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
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (short) 100, (int) '4');
        int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (short) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 100, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (-1));
        com.thealgorithms.others.BFPRT.swap(intArray7, (int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass13 = intArray7.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
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
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray14, (int) '#', 1);
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
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray12, (int) (byte) 1, 0, 0);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray16, (int) ' ', 35);
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
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 100, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, 0, (int) (short) 100);
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
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
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
        java.lang.Class<?> wildcardClass20 = intArray18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
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
            com.thealgorithms.others.BFPRT.swap(intArray2, (int) (byte) 10, (int) (byte) 10);
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
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 100);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) 'a');
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass20 = intArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, 52, 97);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 1, (int) (byte) 0, 0);
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray22, (int) '#', (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0]");
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, 97, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 54 out of bounds for length 1");
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[10]");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
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
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (short) 1, (int) '#', 1);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, 0, 100);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
            int int32 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray29, (int) ' ', (int) (short) 1);
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
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
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
            com.thealgorithms.others.BFPRT.swap(intArray4, 97, 0);
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
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (short) -1, (int) (byte) 10);
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
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 10);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray17, (int) (short) 10, (int) (byte) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray10, 35, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
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
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
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
            com.thealgorithms.others.BFPRT.swap(intArray16, (int) (byte) 0, (int) '4');
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 0]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, (int) 'a', 0);
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
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 97);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = intArray14.getClass();
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
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (short) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray8, (int) (short) 0, 10, (-1));
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        int[] intArray22 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
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
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) (byte) -1, (int) (short) 0);
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
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray9, 10, (int) (byte) -1, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 32);
        java.lang.Class<?> wildcardClass16 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) (short) 0, (int) (byte) 10);
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
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
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
        java.lang.Class<?> wildcardClass23 = intArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (byte) 0, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, (int) ' ', (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, (int) '#', (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 0);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray5, (int) (short) 1, (int) (short) -1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
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
            int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
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
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = com.thealgorithms.others.BFPRT.partition(intArray18, (int) (short) -1, (int) ' ', (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[32]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[32]");
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, (int) (byte) 1, 10);
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
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
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
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
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
        int int21 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray13, 0, (int) (byte) 0);
        com.thealgorithms.others.BFPRT.swap(intArray13, (int) (byte) 0, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 100);
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
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) '#');
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray19, 32, (-1));
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1, 97, 32]");
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray0, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -20");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 100, (int) (byte) 100);
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
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (byte) 100, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -20");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 1, 0, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray17, 10, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
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
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = com.thealgorithms.others.BFPRT.partition(intArray18, (int) (short) -1, (int) '#', (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
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
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray19, (int) (byte) -1);
        int[] intArray24 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, (int) '#');
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
        org.junit.Assert.assertNull(intArray24);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray17, (-1), (-1), 32);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (short) 0, (-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, 35, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -7");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, -1]");
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray8, 52, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.swap(intArray2, (int) (short) 0, (int) (byte) 0);
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
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
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
        int[] intArray28 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray26, 1);
        java.lang.Class<?> wildcardClass29 = intArray28.getClass();
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
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 35);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) '4', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray10, (int) (byte) 10, (int) (short) -1);
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
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
            int int28 = com.thealgorithms.others.BFPRT.bfprt(intArray16, (int) 'a', 97, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
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
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 32);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 10, 52, (int) (short) 0);
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
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (short) 1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 32, 97]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 100);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10]");
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 97);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) ' ', (int) (byte) 10, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        java.lang.Class<?> wildcardClass13 = intArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) (byte) 1, (int) (short) 1, 0);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 0, 0);
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
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray7, 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (short) 0, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (short) 10, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, 52, (int) (short) 100);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray0, 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = intArray13.getClass();
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
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, (int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
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
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        int[] intArray25 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, (int) (short) 10);
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
        org.junit.Assert.assertNull(intArray25);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (short) 100, (int) '#');
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
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (short) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, (int) (short) 1, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) '#');
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
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        int[] intArray3 = new int[] { 0, ' ', 'a' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 32, 97]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 32, 97]");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray5, 0, 0, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 1, 10]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0]");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        int[] intArray0 = null;
        int[] intArray2 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray0, (-1));
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 10, (int) (byte) -1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 1, (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.getMedian(intArray17, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 26 out of bounds for length 1");
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
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) -1);
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
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, 100);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray11, 10, 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) '4', (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray9, 0, (int) ' ', (int) (short) 10);
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
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, (int) '4', (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, (int) (byte) 10, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray17, (int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -19");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 100, 10);
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
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray15, (int) (byte) 100, (int) '#');
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
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, 32);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray14, 10, (int) (short) 1);
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
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, (int) '4', (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, (int) (byte) 10, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, 0, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int34 = com.thealgorithms.others.BFPRT.bfprt(intArray17, (int) (byte) 1, 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 1");
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
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
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
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray15, (int) (byte) 10, (int) (short) 100, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (short) -1, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = com.thealgorithms.others.BFPRT.partition(intArray20, (int) (byte) -1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[0, -1]");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
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
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (byte) 100, 10, 52);
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
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 35);
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
        org.junit.Assert.assertNull(intArray6);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray6, 35, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (-1), 0);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 0, (int) (byte) 10);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (short) 1, 32, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
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
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray2, (int) (short) 1, 52);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 100, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray1, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 10);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray11, (-1), (int) (byte) 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (byte) 100, 10, (int) 'a');
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
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass11 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 76 out of bounds for length 1");
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
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (short) -1, (int) (byte) 0, 100);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        int[] intArray5 = new int[] { 0, 1, (byte) 0, (-1), 100 };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, 1, (int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, 1, 0, -1, 100]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray20, 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.others.BFPRT.partition(intArray20, (int) '4', (int) 'a', 10);
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
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 100, 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray12, (int) (byte) 1, (int) (byte) -1, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) (short) 0, (int) (byte) 1, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 0, 0, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 100);
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
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
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
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) (short) 1, (int) ' ', (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
            int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
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
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 1, (int) (short) 0, 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, (int) (short) 100, 10, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 100);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[10]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray11, 52, 10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -7");
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10]");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) ' ', (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray3, 10, (int) (byte) 10, (int) (byte) 100);
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
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, 97, 35);
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
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
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
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 35, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 44 out of bounds for length 1");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(intArray20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, 35, 35);
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
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = intArray9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '4');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, 32, (int) (short) 0);
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
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 52, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) (byte) 0, (int) '4');
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
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) -1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (byte) 1, (int) '4', 32);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[32, 35, 52]");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray0, (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray7, (int) (short) 100, 35, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, (int) (byte) 1, 97);
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
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
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
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (byte) 0, 35, (int) (byte) -1);
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
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray21, 0, 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
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
        int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray2, (int) (short) 0, 0);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (byte) 100, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (int) (byte) 1, (int) (byte) 0);
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
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
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
            int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray17, 0, 52);
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
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (byte) 1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (short) 0);
        int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, (int) (short) 0, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray1, (int) (byte) -1, (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray9, (-1), (int) (byte) 100, 52);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 97);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
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
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) -1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray9, 35, (int) '#', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
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
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
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
            com.thealgorithms.others.BFPRT.swap(intArray15, (int) (short) 0, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
            com.thealgorithms.others.BFPRT.swap(intArray26, (int) (short) 1, (int) (short) 0);
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
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, 97, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 1, (int) (byte) 0);
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
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
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
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
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
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (short) 10, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, 35, (int) (short) 100);
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
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
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
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray13, (int) (byte) 1, (-1), (int) '4');
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 1, 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
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
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray13, 0, 52, (int) (short) 0);
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
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray15, 52);
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
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
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
        java.lang.Class<?> wildcardClass15 = intArray9.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray21, 100, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
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
            com.thealgorithms.others.BFPRT.swap(intArray15, 1, 35);
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
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray5, 97, (-1));
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[100, 10]");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (short) 100);
        java.lang.Class<?> wildcardClass14 = intArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray5, (int) (byte) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
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
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) 1, 35);
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
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 1, 32);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
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
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray8, (int) (byte) 1, 35, (int) (short) 1);
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
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, (int) (short) 0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (int) (short) 10, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[100, 10]");
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray7, (int) (byte) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray7, 100, 35);
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
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) '4');
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
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray9, 35, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 2");
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
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray2, 1, 97);
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
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        java.lang.Class<?> wildcardClass24 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) 100, 32);
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
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
            com.thealgorithms.others.BFPRT.swap(intArray14, 35, 10);
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
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, 1, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot load from int array because \"arr\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) 'a', (int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 2");
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
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray4, 52, 10, (int) (byte) 1);
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
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, (int) ' ', 0);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray1, (int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 50 out of bounds for length 1");
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
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray14, 100, 97);
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
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (int) (byte) 10, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray6, 10, (int) (byte) 100, (int) (byte) -1);
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
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray18, (int) '#', 97);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, (int) (byte) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = intArray10.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
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
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray16, 97, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, 32, (int) (byte) 100, (int) ' ');
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
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) 'a');
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
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 10);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray16, 32);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }
}

