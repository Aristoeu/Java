package CoinChange;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 12);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 48 + "'", int20 == 48);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 98);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass10 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 34);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass8 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 35);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 12 + "'", int20 == 12);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 49);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, 17);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 37 + "'", int21 == 37);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 48 + "'", int29 == 48);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 48);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 38 + "'", int13 == 38);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        java.lang.Class<?> wildcardClass22 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 35);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) 'a');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 98 + "'", int18 == 98);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        java.lang.Class<?> wildcardClass27 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49 + "'", int24 == 49);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 35);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36 + "'", int23 == 36);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        int[] intArray6 = new int[] { 10, (short) -1, (-1), (byte) 10, '#', (short) 1 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, -1, 10, 35, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 32);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 49);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 6);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 50 + "'", int14 == 50);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 3);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 46 + "'", int16 == 46);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 50);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass8 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 97);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 38);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 34);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 16);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 38);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 51 + "'", int12 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 4);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 48);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 36 + "'", int16 == 36);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 38);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 46 + "'", int19 == 46);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 50);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 46 + "'", int16 == 46);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 9);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 46 + "'", int23 == 46);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 38);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 114);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 35);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 49);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 51);
        java.lang.Class<?> wildcardClass12 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        int[] intArray6 = new int[] { 10, (short) -1, (-1), (byte) 10, '#', (short) 1 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray6);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray6, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray6), "[10, -1, -1, 10, 35, 1]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 12 + "'", int18 == 12);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 36 + "'", int20 == 36);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 50);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 50);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass25 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 47 + "'", int17 == 47);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        java.lang.Class<?> wildcardClass10 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 50);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass9 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 4);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 35);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 106);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 7 + "'", int23 == 7);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 49 + "'", int24 == 49);
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 8);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 5);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 114);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        java.lang.Class<?> wildcardClass22 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 5);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 100);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        java.lang.Class<?> wildcardClass11 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 35);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 4);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 38 + "'", int19 == 38);
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 47 + "'", int22 == 47);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        int[] intArray4 = new int[] { 0, 36, 2, '#' };
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray4, 11);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray4, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray4);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[0, 36, 2, 35]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 38);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 35);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 48);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 16);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 47 + "'", int20 == 47);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 9);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass24 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 49 + "'", int17 == 49);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 48 + "'", int22 == 48);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 10);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 46);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 0);
        java.lang.Class<?> wildcardClass10 = intArray1.getClass();
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 49 + "'", int23 == 49);
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        java.lang.Class<?> wildcardClass25 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 49 + "'", int15 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 102);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 106 + "'", int16 == 106);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        java.lang.Class<?> wildcardClass8 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 6);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }
}

