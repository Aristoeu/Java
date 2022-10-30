package BFPRT;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
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
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray17, 10, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, 35, 0, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[1, 0]");
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, 1, 0);
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
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) -1);
        int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (short) 0, (int) (byte) 1);
        int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray3, 0, 1, 0);
        int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 1, 52);
        int[] intArray29 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, (int) (short) 0, (int) (byte) 100);
        int[] intArray31 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[2, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0]");
        org.junit.Assert.assertNull(intArray31);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, 32);
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 35, 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) -1, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 52, (int) (byte) 10);
        int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray9, 1, 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass20 = intArray19.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0]");
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
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
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray12, (int) (byte) 0, (int) ' ', 0);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) -1);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
        java.lang.Class<?> wildcardClass19 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
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
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
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
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray14, 0, (int) (short) 0, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, (int) (short) 0, 0);
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
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, 35, 32);
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
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray20, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.others.BFPRT.getMedian(intArray20, (int) (byte) 0, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
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
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, 0);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (short) -1, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 52, (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) ' ', (int) (short) 10);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) -1);
        int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (short) 0, (int) (byte) 1);
        int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray3, 0, 1, 0);
        int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 1, 52);
        int[] intArray29 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, (int) (short) 0, (int) (byte) 100);
        int int32 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (byte) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 1, (int) '#');
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
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[2, 1]");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) ' ');
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) ' ', (int) '#');
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass23 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) (byte) 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 32, 97);
        java.lang.Class<?> wildcardClass15 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (byte) 100, (int) (byte) 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) ' ', (int) (byte) 0);
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
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
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
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray6, (int) (short) 10, (int) '#', (int) '#');
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
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 97);
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 35);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray6, 32, 0);
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
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, 100, 52);
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
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (byte) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) '#', 32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 97);
        org.junit.Assert.assertNotNull(intArray1);
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
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, 32, 32);
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
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
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
            int int22 = com.thealgorithms.others.BFPRT.bfprt(intArray18, (-1), 32, (int) (byte) -1);
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
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
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
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
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
        com.thealgorithms.others.BFPRT.swap(intArray29, (int) (short) 1, 0);
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
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray1, (int) (byte) 100, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray14, (int) (short) -1, (int) '4');
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
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 100, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 10);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) (short) -1, 0);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, 97);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray5, (int) (short) 0, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 10]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[10, 100]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[10]");
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
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
        int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (short) 1, (int) (byte) -1);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 32);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, (int) (short) 100, 32);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) (short) 10, 97);
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
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 100, (int) (short) 1);
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
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 1, (-1) };
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 100, 35, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 1, -1]");
        org.junit.Assert.assertNull(intArray6);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = intArray5.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
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
        int[] intArray25 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.others.BFPRT.getMedian(intArray25, 1, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNull(intArray25);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[1, 0]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, (int) (byte) 100, (int) (byte) 100);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) (byte) 10, 32, 52);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 1);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) ' ');
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) '#');
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 1);
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
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, 100, 0);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) '4');
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, (int) (byte) 100, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, (int) '#', (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) 'a', (int) '4');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[100]");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
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
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (int) 'a', (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) ' ');
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
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
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray15, 100, (-1), (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -20");
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 10, (int) (byte) 1, (int) (short) 0);
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
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
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
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, (int) 'a', (int) (short) 1);
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
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 32, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray8, (int) 'a', (int) (byte) 100);
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
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (byte) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray8, (int) 'a', (int) '4', 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -7");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.swap(intArray2, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) '4', (int) (byte) -1);
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
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) (byte) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
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
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (short) 0, (int) (byte) 0, (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray17, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) ' ');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 100, (int) (short) 100);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, (int) '4', (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, 1);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray5, 0, 0, (int) 'a');
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, (int) (short) 100, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray13, (int) '4', 97);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
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
            com.thealgorithms.others.BFPRT.swap(intArray17, (int) (byte) -1, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
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
        com.thealgorithms.others.BFPRT.swap(intArray10, 0, 0);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, 1, (-1));
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 52);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (short) 1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[1, 32, -1, 35, -1]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 35);
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
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
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
        int[] intArray30 = com.thealgorithms.others.BFPRT.copyArray(intArray29);
        int int32 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray30, (int) (short) 100);
        int[] intArray34 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray30, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = com.thealgorithms.others.BFPRT.partition(intArray30, (int) (byte) 10, 52, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[-1]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNull(intArray34);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
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
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray13, (-1), 35);
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
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray8, 100, 1, 10);
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
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
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
            int[] intArray23 = com.thealgorithms.others.BFPRT.partition(intArray15, (int) ' ', (int) (short) -1, (int) (short) 100);
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
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray15, 0, (int) '#');
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, 0, 10);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.others.BFPRT.partition(intArray19, 1, 35, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) -1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) (short) 1, 10);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
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
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 52);
        java.lang.Class<?> wildcardClass17 = intArray11.getClass();
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 97);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray16, 52, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray12, (int) (byte) -1, 97, 1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
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
        int int24 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray19, 100);
        int[] intArray26 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, (int) '4');
        int[] intArray30 = com.thealgorithms.others.BFPRT.partition(intArray19, 1, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray30, (int) '4', 52);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNull(intArray26);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[1, 0]");
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (byte) 100, (int) (byte) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) (byte) -1, (int) (short) 100, (int) (byte) 10);
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
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
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
            com.thealgorithms.others.BFPRT.swap(intArray12, 0, (int) (short) -1);
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
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
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
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 32);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
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
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray17, (int) '#', (-1));
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
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 0, (int) (byte) 10);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (-1), 35);
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
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray20, 10, (int) ' ');
        int int25 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray20, 32);
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, 35);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, 97, 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray6, (int) '#', (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (byte) 100, 100);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (byte) 1, (int) (short) 0, 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 0, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, (int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) (short) 1, (int) ' ', (int) (short) 100);
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
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
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
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray15, (-1), 0, (int) (byte) -1);
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
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 1, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
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
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, 35);
        int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray8, 0, 0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray8, (int) '4', (int) (short) -1);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0]");
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (int) '4', (-1), (int) '#');
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray7, 0, (int) (short) 10);
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
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 35, (int) (short) 0, 1);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        int[] intArray0 = null;
        int[] intArray2 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray0, (int) (short) 0);
        org.junit.Assert.assertNull(intArray2);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
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
        int[] intArray24 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (-1), (int) (byte) 100, (int) '#');
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
        org.junit.Assert.assertNull(intArray24);
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, (int) (short) -1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
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
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray20, (int) '#');
        int[] intArray24 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray20, 35);
        int[] intArray25 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = com.thealgorithms.others.BFPRT.bfprt(intArray20, (int) (short) -1, (int) (byte) 100, 0);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNull(intArray24);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1]");
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
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
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray18, 32, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        com.thealgorithms.others.BFPRT.swap(intArray2, (int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) '4', (int) (byte) 100, (int) (short) 100);
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
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray7, (int) (byte) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray7, (int) (short) 100, 0);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray20, (int) (byte) -1, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1, 97, 32]");
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        java.lang.Class<?> wildcardClass8 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
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
        java.lang.Class<?> wildcardClass25 = intArray1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, 52);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 52);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 97);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, 1, (int) (short) 1);
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
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
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
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 100, 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray12, (int) (short) 100, (int) (byte) -1, (-1));
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 100, (int) (short) 0);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray1, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, 1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray10, (int) ' ', (int) (byte) 100, (int) (byte) 100);
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
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 97, (int) (byte) 0);
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
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
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
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        com.thealgorithms.others.BFPRT.swap(intArray20, (int) (short) 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.others.BFPRT.getMedian(intArray20, (int) ' ', (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        int[] intArray1 = new int[] { (short) 100 };
        int[] intArray3 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertNull(intArray3);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 10, 10);
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
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 35, 97);
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
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
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
        int int27 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray25, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray25, 1, 32);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, (int) (short) 100);
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, (int) 'a');
        int[] intArray25 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, 1);
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
        org.junit.Assert.assertNull(intArray21);
        org.junit.Assert.assertNull(intArray23);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[-1]");
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray7, (int) 'a', (-1), (-1));
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
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
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
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.bfprt(intArray19, (int) (short) 100, 1, 35);
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
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 97);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 97);
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
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
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
        int[] intArray23 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
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
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 1, (int) (byte) -1, (int) (short) 10);
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
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 52);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 0, 0, 10);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 10, 100, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[32, 35, 52]");
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 100, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (byte) 10, (int) (short) 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) 100);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 10);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) (byte) 1, 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) 'a', 52, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[2, 1]");
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = com.thealgorithms.others.BFPRT.bfprt(intArray0, (int) (byte) -1, (int) (short) -1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.getMedian(intArray2, (int) (byte) 0, 35);
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
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
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
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.getMedian(intArray12, 52, (int) 'a');
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
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray1, (int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) (short) 100);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 35);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = intArray17.getClass();
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, 1, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
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
        // The following exception was thrown during execution in test generation
        try {
            int int31 = com.thealgorithms.others.BFPRT.bfprt(intArray27, 0, 1, (int) '4');
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
        org.junit.Assert.assertNull(intArray27);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) ' ');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        com.thealgorithms.others.BFPRT.insertionSort(intArray16, (int) '4', 0);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray10, (int) (byte) 0, (int) (byte) -1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 32, 97]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
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
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray19, 100, (int) (byte) 10);
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
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
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
        java.lang.Class<?> wildcardClass21 = intArray18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray3, 97, (int) (short) 0, 0);
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
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 1, (int) (short) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 97, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        com.thealgorithms.others.BFPRT.swap(intArray2, (int) (short) 1, (int) (short) 0);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNull(intArray19);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        com.thealgorithms.others.BFPRT.swap(intArray1, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 32);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) (short) 100, (int) (short) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
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
        int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray18, (int) (byte) 1, 0, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.getMedian(intArray18, 10, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0]");
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
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
        int int24 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray22, (int) '#');
        int[] intArray26 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray22, (-1));
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
        org.junit.Assert.assertNull(intArray26);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray2, 97, 35, 10);
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
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 1, 0);
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
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) (byte) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (-1), (int) 'a');
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
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 0, 0);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray8, 1, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (byte) 100, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) ' ', (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), 97);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 35, 1);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 32);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[0]");
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, (int) (byte) 10, 35);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) '4', 100);
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
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
        com.thealgorithms.others.BFPRT.insertionSort(intArray21, (int) '#', (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray21, 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -6");
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
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
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
        int[] intArray27 = com.thealgorithms.others.BFPRT.copyArray(intArray26);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = com.thealgorithms.others.BFPRT.partition(intArray26, 35, (int) (short) -1, 1);
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
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[-1]");
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 100, (int) (short) -1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.getMedian(intArray1, 32, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray1, 52, (int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, 0, 10);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, (int) '#', (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (short) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, 0, 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 1);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray9, 10, (int) 'a');
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
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) '#', (int) '#', (int) (short) 0);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray13, 52, (int) (short) 100, (int) (short) 100);
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
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, (int) (short) 100, (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) (short) 100);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 100, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, 35);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (byte) 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 97);
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 35);
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
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (short) 100, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 0, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray14, 100);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, 10);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 0, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 0, (-1));
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray9, (int) (byte) 10, 0);
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
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
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
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int int23 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray20, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.others.BFPRT.bfprt(intArray20, (int) (short) -1, (int) 'a', (int) '#');
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, 0);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
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
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray1, (int) '#', 0, 0);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 10, (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) '4', (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray2, (int) (short) -1, (int) (byte) 0);
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
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 100);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
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
        int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray18, (int) (byte) 1, 0, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[1, 0]");
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 97);
        java.lang.Class<?> wildcardClass12 = intArray5.getClass();
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
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
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
        int int21 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, 0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (byte) -1, (int) '#', 10);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 10);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.bfprt(intArray17, (int) '4', 52, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) 'a');
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 0, (int) (short) 0, (-1));
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (-1));
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray14, (int) (short) -1, 100, 10);
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
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray5, (int) (short) 0, (int) (byte) 0);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) '4');
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -11");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, -1, 10, 1]");
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int int18 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, (int) (byte) 0, (int) (byte) 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray20, 32, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
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
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (short) 1, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
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
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray14, (int) (byte) 10, 1);
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
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray10, 97, (int) (byte) 10, 1);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, 35);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, 97, 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 100);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
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
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray7, 97, (int) (short) 100, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray10, (int) (short) 0, 52);
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
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
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
        int[] intArray27 = com.thealgorithms.others.BFPRT.copyArray(intArray26);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = com.thealgorithms.others.BFPRT.partition(intArray26, 35, (int) '#', 100);
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
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[1, 0]");
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 100);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[100, 10]");
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) 1, (int) (short) -1);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray17, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.bfprt(intArray17, (int) (short) -1, (int) ' ', (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (byte) 0, 97);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = intArray1.getClass();
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        int[] intArray2 = new int[] { (byte) 100, (byte) 10 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (short) 0, (int) (short) 100, (int) ' ');
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
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        java.lang.Class<?> wildcardClass9 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 97);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray16, 10, (int) 'a');
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
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, (int) (short) 1);
        int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 1, 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray11, 1, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '4', 1);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) -1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray4, 52, 0, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 32, (int) ' ');
        int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray5, 0, (int) (short) 0);
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 10);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 0);
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
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        com.thealgorithms.others.BFPRT.insertionSort(intArray7, 1, (int) ' ');
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 0);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 10);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) '4');
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) -1, 52);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) ' ', (-1));
        int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray8, 32, (int) (short) 10);
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
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray7, (int) (byte) 1, 0);
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
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) (short) 0, (int) (byte) 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray2, 35, (int) (byte) 0, (int) 'a');
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
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 100, (int) 'a', 35);
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
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray6, (int) (short) 0, (int) (byte) 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) -1, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, 1, (int) '#');
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
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
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
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int21 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (byte) 0, 52, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray1, (int) (short) 10, 0);
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
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 0);
        java.lang.Class<?> wildcardClass20 = intArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 1, (int) (short) 100);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 10, 32);
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
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) -1, 0);
        int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) (byte) 0, 0, 52);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 35);
        int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (byte) 1, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNull(intArray9);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0]");
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) -1);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (byte) 1, 32, (int) 'a');
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
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 97, 32]");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
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
        java.lang.Class<?> wildcardClass29 = intArray18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = com.thealgorithms.others.BFPRT.partition(intArray26, (int) (short) 0, 97, (int) '4');
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
        org.junit.Assert.assertNull(intArray32);
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, 32);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray14, (int) (byte) 1, 32);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '#');
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.bfprt(intArray20, (int) (byte) 1, (int) ' ', 52);
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
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1, 32, 97]");
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 32);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 0);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) '4');
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (byte) 0, (int) ' ');
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
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) ' ', (int) ' ');
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 100, (int) (short) 100);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, (-1));
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 100);
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
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (-1), (int) (short) 1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, 10);
        java.lang.Class<?> wildcardClass18 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, 0);
        java.lang.Class<?> wildcardClass15 = intArray12.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, 0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 35, 32);
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
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (byte) 0, 0, (int) (short) 1);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.getMedian(intArray4, (int) (short) 10, (int) (byte) 100);
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
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) 0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) '#', (int) ' ');
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
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 0, (int) (byte) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 35);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.getMedian(intArray6, (int) (short) 1, (-1));
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
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (short) 0, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (short) 10, (int) (byte) 10);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray12, 97, 0, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
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
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.swap(intArray1, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -18");
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
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray13, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 100);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray7, 1, (int) (byte) 100);
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
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (byte) 100, (int) (byte) 1, (int) (short) -1);
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
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.swap(intArray2, 0, 0);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.getMedian(intArray21, (int) (short) 100, (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (int) '#', 0);
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
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray4, 0, 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (short) 100);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 100, (-1));
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray19, 35, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = com.thealgorithms.others.BFPRT.bfprt(intArray19, 1, (int) (short) 100, (int) (byte) 10);
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
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (short) 100);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) 'a', (int) (short) 0);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray17, 52, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, 32);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray5, 32, 100, 35);
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
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (int) '4', (int) (byte) 1);
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
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, 35);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 52, (int) (byte) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 100);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, 32, 35);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) (byte) -1, (int) (byte) 100, (int) (short) 100);
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
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, 0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 97, (int) ' ');
        int[] intArray22 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray24 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray22, (int) (byte) -1);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[-1]");
        org.junit.Assert.assertNull(intArray24);
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 52);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        java.lang.Class<?> wildcardClass9 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, 35, 0);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 35);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.others.BFPRT.getMedian(intArray6, 97, 0);
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
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) -1);
        int int20 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 0, (int) (byte) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray3, 1, 1, 10);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray3, (int) (short) 0, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 100);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 32, (int) (short) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray8, 0, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) 'a');
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 0, (int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray10, 32, 0);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 0]");
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
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
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray9, (int) '4', 97);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = com.thealgorithms.others.BFPRT.partition(intArray0, (int) (short) 1, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) 0, (int) (byte) 1);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 32);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) 'a', (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 10, 0);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (short) 100, 0, (int) '4');
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
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 100, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, (-1));
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = intArray11.getClass();
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, (int) (byte) 10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 10, 52, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray0, 97, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray4, (int) (short) 1, (int) (short) 10, 35);
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
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
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
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray15, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, 52);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray13, 32, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray9, 32, 10, 0);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
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
        int int23 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (short) 0);
        int[] intArray25 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, 10);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(intArray25);
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray0, 32, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -5");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, 52);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 100);
        int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) (byte) 1, (int) (short) -1);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray9, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) '4', (int) (short) 100, (int) (short) 1);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass7 = intArray6.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, 100, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, (int) (short) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 1, (-1));
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 52);
        com.thealgorithms.others.BFPRT.insertionSort(intArray13, (int) (short) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) -1);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.swap(intArray11, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray11, (int) '#', 100, (int) (byte) 0);
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
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (-1));
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) -1, 35, 32);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (short) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
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
        int int27 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray25, (int) (byte) 100);
        int[] intArray28 = com.thealgorithms.others.BFPRT.copyArray(intArray25);
        int[] intArray30 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray25, 35);
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray30);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (byte) 0, (int) (byte) 10);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 0, 1, 10]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
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
        int[] intArray32 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray17, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int36 = com.thealgorithms.others.BFPRT.bfprt(intArray17, (int) (short) 100, 0, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[0]");
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, 32, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) -1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray7, (int) (byte) 10, 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray7, 10, 97, 97);
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
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
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
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray21, 52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.others.BFPRT.partition(intArray21, 35, (int) (short) 0, (int) ' ');
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
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray1, (-1), 32);
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
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray7, (int) (short) 100, (int) (short) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.getMedian(intArray0, 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray22, (int) (byte) 0, (int) ' ');
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
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
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
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, 32, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray18, (int) (short) 1, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[10]");
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) '4');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, 97);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 32, 10);
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
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
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
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray13, (int) (short) -1, (int) (short) 100, (-1));
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
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
            int int28 = com.thealgorithms.others.BFPRT.getMedian(intArray18, (int) '#', (-1));
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
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
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
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) 'a', 100, 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray4, 0, 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[32, 35, 52]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[32]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int11 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray8, (int) (short) 0, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, 0]");
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
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
            int int20 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray17, 52, 0);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[0]");
        org.junit.Assert.assertNull(intArray17);
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
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
            com.thealgorithms.others.BFPRT.swap(intArray10, 0, (int) 'a');
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1]");
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray8, 0, (-1), 10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray12, 100, (int) ' ');
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1]");
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
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
        int[] intArray30 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray18, 100);
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
        org.junit.Assert.assertNull(intArray30);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray11, (int) 'a', 97);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, 35);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray6, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, 100, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (-1));
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, 52, (int) (byte) 1);
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
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (-1), (int) (byte) -1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (short) 0, (-1));
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, 0, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) (byte) 10, 52, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 0, 10, 1]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0, -1, 10, 1]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 0, 10, 1]");
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
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
            int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray9, (int) (byte) 1, (int) '4', (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
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
        int[] intArray27 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray25, (int) ' ');
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
        org.junit.Assert.assertNull(intArray27);
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
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
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (int) (short) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 32);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray0, (int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -8");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) 10, (int) (short) 10);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) (byte) 0, (int) (byte) 10);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray9, (int) (byte) 10);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 52, 32);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 35);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) 'a');
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray11, (-1), 32, 0);
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
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray5, 35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 52, (int) (short) -1);
        java.lang.Class<?> wildcardClass13 = intArray9.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (short) -1, (int) (byte) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 0, (int) '#');
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 1);
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) 'a', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (byte) 10, 97, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) '4');
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) '#', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray5, 1, (int) (short) -1, 10);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 10, 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[100]");
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100]");
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, (int) (short) 100);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray5, (int) (byte) -1, (int) ' ');
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
        org.junit.Assert.assertNull(intArray5);
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
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
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) 'a', (int) (short) 10);
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
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray8, 0, (-1), 10);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.bfprt(intArray13, 52, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -9");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNull(intArray13);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, 1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 10);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) ' ', (int) (byte) 100);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray1, (int) '#', 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(intArray5);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
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
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray12, (int) '#', (int) (byte) 10, (int) ' ');
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
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
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
        java.lang.Class<?> wildcardClass21 = intArray15.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray5, 35, (int) (short) -1, (int) '4');
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
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 0, 52);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 0, 0);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
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
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) 'a');
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNull(intArray20);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) (byte) 0, (int) ' ');
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 32, 97]");
        org.junit.Assert.assertNull(intArray14);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, (int) (short) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) '#', (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 10, 100);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (byte) 1, (-1));
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray8, (int) (byte) -1, 100);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
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
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray18, 100);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) -1, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) 'a', (int) '4');
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
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, 0, 0);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
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
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, 0, (int) (short) 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray12, (int) (short) 1, (int) '4', (int) (short) 100);
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
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 0, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) '4', 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, (int) (short) 0, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray8, 0, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2, 1]");
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray9, 52, 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -10");
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
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray13, (int) ' ', 10, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '#');
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.swap(intArray8, 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.bfprt(intArray8, 10, 52, (int) (short) 10);
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
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (short) 100, 0);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray14);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, 1);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray18);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0]");
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray9, 0, (int) (byte) 100);
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
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.others.BFPRT.bfprt(intArray7, 32, 0, 0);
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
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1]");
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 100);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 10);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 100);
        int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) 'a');
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[-1]");
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[-1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, -1]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray18 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (byte) 1, 0, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = com.thealgorithms.others.BFPRT.partition(intArray11, (-1), (int) ' ', 0);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1, 0]");
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) -1, 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
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
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1]");
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, 0);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, 100, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.getMedian(intArray10, (-1), (int) (byte) -1);
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
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 0, (int) (short) 100);
        int int16 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 100);
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        java.lang.Class<?> wildcardClass18 = intArray17.getClass();
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[-1]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 100);
        int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray16, 1, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray16);
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
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[1, 0]");
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 100);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, (int) '#', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.others.BFPRT.bfprt(intArray9, 97, 97, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) '4', (int) '4');
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
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        int[] intArray5 = new int[] { (short) 1, 32, (-1), '#', (-1) };
        int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (short) 0, 0, (int) (byte) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray10, (int) (byte) 10, (int) ' ');
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
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (-1));
        int int12 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray7, (int) (byte) 1, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = com.thealgorithms.others.BFPRT.partition(intArray5, (int) (byte) 10, (int) (byte) -1, 100);
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
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, 32);
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
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, 97);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 100);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, 52);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 100, 100);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray1, (int) ' ', 97);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        com.thealgorithms.others.BFPRT.swap(intArray3, 0, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.getMedian(intArray3, 0, (int) '4');
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
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
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
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, 1, 1);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
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
            int int24 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, 100, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 1);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.bfprt(intArray15, (int) (byte) 10, (int) 'a', (int) (short) 1);
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
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, -1]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, 1, (int) (short) 1);
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
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray2, 1, (int) (short) 1, 97);
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, (int) (byte) 10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray21, (int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100, 0]");
        org.junit.Assert.assertNull(intArray15);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[2, 1]");
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        int int13 = com.thealgorithms.others.BFPRT.bfprt(intArray9, (int) (byte) 0, 0, (int) (byte) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNull(intArray8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) '4');
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, 1, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.others.BFPRT.getMedian(intArray11, 97, (int) (short) 100);
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
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int int12 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (byte) 1, (-1));
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, (-1));
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
        org.junit.Assert.assertNull(intArray15);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
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
            int[] intArray16 = com.thealgorithms.others.BFPRT.partition(intArray10, (int) (short) 1, (int) (byte) 100, 0);
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
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray6);
        com.thealgorithms.others.BFPRT.insertionSort(intArray6, (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray6, 35, 52);
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
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, 0, 10);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray15, 32);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        int[] intArray0 = null;
        com.thealgorithms.others.BFPRT.insertionSort(intArray0, (int) (byte) 1, 32);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (byte) 0);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, 10, 97);
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
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) '4');
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 0]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
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
        int[] intArray17 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        com.thealgorithms.others.BFPRT.insertionSort(intArray10, (int) (byte) 100, 35);
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 1);
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
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[0]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) 'a');
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
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.partition(intArray1, (int) (short) 0, (int) (byte) -1, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 97);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.bfprt(intArray12, (int) (short) 1, (int) '#', (int) (byte) 100);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, -1]");
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, (int) (short) 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray6, 0, 32, (int) (short) 0);
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
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
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
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int int23 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray20, 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray27 = com.thealgorithms.others.BFPRT.partition(intArray20, 0, (int) (short) 1, (int) (byte) 10);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
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
            int int16 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray13, (int) (short) 10, (int) (short) 100);
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
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 0);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, 0, 52);
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
        org.junit.Assert.assertNull(intArray10);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 1, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (byte) 100, 0);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray12);
        com.thealgorithms.others.BFPRT.insertionSort(intArray12, (int) 'a', (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray12, 100, (int) (byte) 1, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1]");
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[-1]");
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
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
            int int23 = com.thealgorithms.others.BFPRT.getMedian(intArray16, (int) (short) 1, (int) (short) 100);
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
        org.junit.Assert.assertNull(intArray18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray9);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.insertionSort(intArray10, 97, 35);
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
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
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
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray13, (int) (byte) -1, 100);
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
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray7, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray1);
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
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray8);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray8, 32);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray8, (int) ' ', (int) '4');
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
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray12);
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, 97);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray1, (-1), 52, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = com.thealgorithms.others.BFPRT.partition(intArray19, (int) ' ', (int) (short) 1, (int) (byte) 1);
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
        org.junit.Assert.assertNull(intArray24);
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 10, (int) (short) 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 1, 97);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
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
            int int14 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) ' ', 52, (int) (byte) 0);
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
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 0);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 32);
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
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[-1]");
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) '4');
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 0, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.getMedian(intArray5, 100, (int) '4');
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
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray3, (int) (byte) 0, (int) (short) 10, (int) (short) 100);
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
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
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
        int[] intArray25 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray15, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNull(intArray25);
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 10);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.others.BFPRT.getMedian(intArray4, (int) '4', 1);
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
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[0]");
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        java.lang.Class<?> wildcardClass16 = intArray15.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[-1, 97, 32]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 0);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 0);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray16, (int) (byte) 10);
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
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) (byte) 10);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 32, 97);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, 35, (int) (short) 0);
        int[] intArray18 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.others.BFPRT.bfprt(intArray5, (int) (byte) 100, (int) '4', (int) (short) 10);
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
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) '#');
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int10 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray7, (int) (byte) 1, (int) (short) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, 52);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray16, 1, (int) '4');
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
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray14);
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, 1, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (short) 10, 1);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) '#', (int) ' ');
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 52);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray3, (int) (short) -1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[32, 35, 52]");
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[32, 35, 52]");
        org.junit.Assert.assertNull(intArray6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray31, 100, (int) ' ');
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
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.others.BFPRT.getMedian(intArray10, 97, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(intArray10);
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        int[] intArray1 = new int[] { (byte) 0 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) '4');
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (-1), (int) (short) -1);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (byte) 1);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int14 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray12, (int) (short) -1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray12, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = intArray16.getClass();
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
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
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
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = com.thealgorithms.others.BFPRT.partition(intArray16, 97, (int) 'a', 10);
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
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1, 0]");
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (int) (byte) 100);
        int[] intArray16 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        java.lang.Class<?> wildcardClass17 = intArray16.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray9, 1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = com.thealgorithms.others.BFPRT.partition(intArray9, 32, 10, (int) (short) 0);
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
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int[] intArray17 = com.thealgorithms.others.BFPRT.partition(intArray11, (int) (short) 0, (int) (short) 0, 0);
        int int19 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, 97);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        java.lang.Class<?> wildcardClass21 = intArray20.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
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
        com.thealgorithms.others.BFPRT.insertionSort(intArray18, (int) '#', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = com.thealgorithms.others.BFPRT.bfprt(intArray18, 0, (int) '4', (int) (short) 10);
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
        org.junit.Assert.assertNull(intArray22);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) 10, (int) '#');
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, 1, (int) (byte) -1);
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
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, 32, (int) 'a');
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 10);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray8, (int) (short) -1, (int) ' ');
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
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = com.thealgorithms.others.BFPRT.partition(intArray4, 10, (int) (byte) 1, 10);
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
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
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
            com.thealgorithms.others.BFPRT.swap(intArray4, (int) (short) 10, 0);
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
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int[] intArray10 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (short) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray10, (int) (byte) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray13);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) '#');
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
        org.junit.Assert.assertNull(intArray16);
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) '#');
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (byte) -1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 10, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray2, 97, 52, 1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray11, (-1));
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        com.thealgorithms.others.BFPRT.insertionSort(intArray14, (int) (byte) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray14.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[1, 0]");
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1, 97, 32]");
        org.junit.Assert.assertNull(intArray13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
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
            com.thealgorithms.others.BFPRT.swap(intArray20, (-1), (int) (short) 10);
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
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 1);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray2, 52, 100, (int) ' ');
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
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 35);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (byte) 100, (int) (short) 100);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) -1, (int) '4', 0);
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
        org.junit.Assert.assertNull(intArray11);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1]");
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
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
        int[] intArray18 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, 0);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNull(intArray18);
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
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
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.others.BFPRT.bfprt(intArray2, (-1), 1, 100);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1]");
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 1);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray12 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, 0);
        org.junit.Assert.assertNotNull(intArray1);
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
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray13 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 1, 0, (int) (short) 100);
        int[] intArray15 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray13, (int) (short) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray15, 0);
        int[] intArray19 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray15, 52);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, (int) (short) 0, (int) (short) 1);
        int int24 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray15, (int) (short) 0);
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
        org.junit.Assert.assertNull(intArray19);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray4, (int) (byte) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 10, (int) '#');
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) 'a', (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[-1]");
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray2, (int) (byte) 100, (int) (byte) 10);
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
        org.junit.Assert.assertNull(intArray5);
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.swap(intArray2, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray2, (int) (byte) 100, (int) (byte) -1);
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
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray6 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) 'a');
        int int8 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) (short) 1);
        int int10 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.bfprt(intArray14, (int) (byte) 10, (int) (byte) 10, 100);
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
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        int[] intArray4 = new int[] { (byte) 0, (-1), (short) 10, (short) 1 };
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, (int) (byte) 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray5, (int) (byte) 1);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (short) -1, 0);
        com.thealgorithms.others.BFPRT.insertionSort(intArray11, (int) (byte) 1, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray11, (int) (byte) 100, (int) (byte) -1);
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
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) 'a');
        int[] intArray9 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 10, (-1), 100);
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
        org.junit.Assert.assertNull(intArray11);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.copyArray(intArray20);
        int[] intArray23 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray20, 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = intArray23.getClass();
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
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1, 97, 32]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[-1]");
        org.junit.Assert.assertNull(intArray23);
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (int) (short) 1, (int) (short) 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray5, (-1), (int) '4');
        int[] intArray15 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        com.thealgorithms.others.BFPRT.insertionSort(intArray15, (int) (byte) 100, (int) 'a');
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray15);
        org.junit.Assert.assertNotNull(intArray1);
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
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        int[] intArray1 = new int[] { (byte) 100 };
        int int3 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, 0);
        int int5 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray1, (-1));
        int int9 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray1, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray1, (int) (byte) 0, 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray14 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[100]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(intArray7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[100]");
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100]");
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
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
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
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
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        int[] intArray3 = new int[] { ' ', '#', '4' };
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int int7 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray5, 52);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray5);
        java.lang.Class<?> wildcardClass9 = intArray5.getClass();
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
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
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
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray8, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.others.BFPRT.getMedian(intArray8, (int) (byte) 10, (int) (byte) 100);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.others.BFPRT.bfprt(intArray4, (int) (byte) 100, (int) '#', (int) 'a');
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
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, (int) (byte) 0, 0, (int) (byte) 1);
        int int12 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray3, (int) ' ');
        int int15 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray3, 1, (int) (byte) 1);
        int[] intArray17 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray3, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.others.BFPRT.getMedian(intArray17, 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
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
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        int[] intArray3 = new int[] { (short) -1, 'a', ' ' };
        com.thealgorithms.others.BFPRT.swap(intArray3, (int) (byte) 0, (int) (short) 0);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) ' ');
        int[] intArray10 = com.thealgorithms.others.BFPRT.copyArray(intArray7);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray10);
        int int14 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray11, (int) (short) 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray0, 52, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray14 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (short) 1);
        int[] intArray16 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (-1));
        int int18 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, 0);
        int[] intArray19 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray19, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[100, 0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[0]");
        org.junit.Assert.assertNull(intArray16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[100, 0]");
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
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
        int[] intArray21 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray14, (int) (short) 10);
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
        org.junit.Assert.assertNull(intArray21);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, 100, (int) (short) 100);
        com.thealgorithms.others.BFPRT.insertionSort(intArray2, (int) (short) 0, (int) (short) 0);
        int[] intArray13 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int int15 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray13, (int) (byte) -1);
        int[] intArray19 = com.thealgorithms.others.BFPRT.partition(intArray13, 0, (int) (short) -1, (int) (byte) 0);
        int[] intArray20 = com.thealgorithms.others.BFPRT.copyArray(intArray19);
        java.lang.Class<?> wildcardClass21 = intArray19.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.partition(intArray4, 0, (int) (byte) -1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray4, 1);
        com.thealgorithms.others.BFPRT.insertionSort(intArray4, (int) (short) 1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray4, (int) (byte) 10, (int) (short) 10);
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
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
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
        int int20 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray17, (int) ' ');
        com.thealgorithms.others.BFPRT.insertionSort(intArray17, (int) (short) -1, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray4 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray6 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray7 = com.thealgorithms.others.BFPRT.copyArray(intArray4);
        int[] intArray9 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray7, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            com.thealgorithms.others.BFPRT.swap(intArray9, 10, 35);
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
        org.junit.Assert.assertNull(intArray9);
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray3 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        com.thealgorithms.others.BFPRT.insertionSort(intArray3, (int) (short) 0, 10);
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray3, 0, 0, 0);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray3);
        int int13 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray11, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray11.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        int[] intArray1 = new int[] { (short) -1 };
        int[] intArray2 = com.thealgorithms.others.BFPRT.copyArray(intArray1);
        int[] intArray4 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, 1);
        int[] intArray5 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray7 = com.thealgorithms.others.BFPRT.getMinKNumsByBFPRT(intArray2, (int) (byte) 0);
        int[] intArray8 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
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
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        int[] intArray2 = new int[] { 100, 0 };
        int int4 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (int) (short) 1);
        int int6 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray2, (-1));
        int[] intArray10 = com.thealgorithms.others.BFPRT.partition(intArray2, (int) (byte) 0, 1, 100);
        int[] intArray11 = com.thealgorithms.others.BFPRT.copyArray(intArray2);
        int[] intArray12 = com.thealgorithms.others.BFPRT.copyArray(intArray11);
        int int15 = com.thealgorithms.others.BFPRT.getMedian(intArray12, (int) (byte) 0, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
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
        int int22 = com.thealgorithms.others.BFPRT.getMinKthByBFPRT(intArray20, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray20, (int) '4', (int) (short) 0);
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
        org.junit.Assert.assertNull(intArray12);
        org.junit.Assert.assertNull(intArray17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[-1]");
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[-1]");
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[-1]");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
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
            int int17 = com.thealgorithms.others.BFPRT.medianOfMedians(intArray12, 100, 100);
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
}

