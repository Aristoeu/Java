package CoinChange;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 38);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 98);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 98 + "'", int14 == 98);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 15);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 51 + "'", int22 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 32 + "'", int26 == 32);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 41);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 41 + "'", int24 == 41);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 98);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 99 + "'", int18 == 99);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (-1));
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 51 + "'", int24 == 51);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 51);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 28);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 29 + "'", int23 == 29);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass5 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 41);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 28);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 49 + "'", int20 == 49);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
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
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 16);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 52);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 114);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 16 + "'", int10 == 16);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 54);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 39);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 39 + "'", int23 == 39);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 51);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 37);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 38 + "'", int13 == 38);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 54);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 33 + "'", int18 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 8);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 47 + "'", int11 == 47);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 55);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
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
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 46 + "'", int26 == 46);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, 17);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (byte) 100);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 0);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 13);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33 + "'", int16 == 33);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (-1));
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 0);
        java.lang.Class<?> wildcardClass21 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 102 + "'", int16 == 102);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 15);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass17 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass14 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        int[] intArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 55);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 99);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 55);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 1);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 98);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 41);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 42 + "'", int19 == 42);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 18);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36 + "'", int10 == 36);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 8);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 55);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass19 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
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
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 16 + "'", int13 == 16);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 49 + "'", int22 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 97);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 13);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 29);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 49);
        java.lang.Class<?> wildcardClass17 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 50 + "'", int16 == 50);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 14);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int30 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 48 + "'", int30 == 48);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 40);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 39);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36 + "'", int19 == 36);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 51 + "'", int11 == 51);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 50);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 114);
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
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
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
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 10);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 4);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, 98);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        java.lang.Class<?> wildcardClass23 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        java.lang.Class<?> wildcardClass9 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass12 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
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
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 4);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 17);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 18 + "'", int21 == 18);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 46 + "'", int13 == 46);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 29);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 14);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 54);
        int int29 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 33 + "'", int18 == 33);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 17);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 17 + "'", int20 == 17);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 55);
        java.lang.Class<?> wildcardClass23 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 55);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 16);
        java.lang.Class<?> wildcardClass13 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 16 + "'", int12 == 16);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 50);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 130);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 48 + "'", int14 == 48);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 33);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 33 + "'", int16 == 33);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 98);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 106);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 99 + "'", int17 == 99);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        java.lang.Class<?> wildcardClass24 = intArray0.getClass();
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 46 + "'", int18 == 46);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 18 + "'", int22 == 18);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 29);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 28);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '#');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 106);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 102);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '#');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 114 + "'", int20 == 114);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 106 + "'", int22 == 106);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int30 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 40);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 51 + "'", int18 == 51);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 36 + "'", int23 == 36);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 41 + "'", int30 == 41);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 33 + "'", int20 == 33);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 9);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 40);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
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
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 18 + "'", int18 == 18);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 54);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 33);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 33 + "'", int21 == 33);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 102 + "'", int17 == 102);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 55);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) 'a');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 102);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 106 + "'", int17 == 106);
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
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
        java.lang.Class<?> wildcardClass18 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 12);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 39);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37 + "'", int20 == 37);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 15);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 15 + "'", int20 == 15);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 97);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 51 + "'", int15 == 51);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 52);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 51);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 53 + "'", int18 == 53);
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass11 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 38);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 38 + "'", int17 == 38);
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        java.lang.Class<?> wildcardClass29 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 51 + "'", int22 == 51);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 48 + "'", int28 == 48);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 28);
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
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 47 + "'", int25 == 47);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 37);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 49 + "'", int21 == 49);
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 54);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 102);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 51);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        java.lang.Class<?> wildcardClass14 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
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
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 17);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 14);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -2147483648");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 36 + "'", int13 == 36);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 34);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 106);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 114);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 12 + "'", int24 == 12);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 48 + "'", int26 == 48);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 15);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 48);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 28);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14 + "'", int18 == 14);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass23 = intArray3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 6);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 102 + "'", int14 == 102);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        java.lang.Class<?> wildcardClass21 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
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
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 12);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 48);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 49);
        java.lang.Class<?> wildcardClass11 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 49 + "'", int10 == 49);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
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
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 51 + "'", int19 == 51);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '#');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 17);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 50);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 5);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 16);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        int[] intArray1 = new int[] { 11 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray1);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[11]");
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 130);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 28 + "'", int22 == 28);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
        java.lang.Class<?> wildcardClass13 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 50);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 42);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 51 + "'", int14 == 51);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
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
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
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
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
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
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        java.lang.Class<?> wildcardClass26 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 34);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 40);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 47 + "'", int20 == 47);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 40 + "'", int24 == 40);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 98);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 37);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '#');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 6);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        java.lang.Class<?> wildcardClass22 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 97);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 114);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 53 + "'", int17 == 53);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 15 + "'", int23 == 15);
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 4);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass15 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 102);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36 + "'", int14 == 36);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 38);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 38 + "'", int19 == 38);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 14);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 14 + "'", int15 == 14);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass18 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 53 + "'", int11 == 53);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 40);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        java.lang.Class<?> wildcardClass15 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 36);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 97);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 1);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) 'a');
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 98 + "'", int23 == 98);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 11);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (-1));
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 41);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 37);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 32);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 99);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 49 + "'", int13 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '#');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 114 + "'", int20 == 114);
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 46 + "'", int15 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 46);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 48);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        int[] intArray1 = new int[] { 97 };
        int int3 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray1, (int) (short) 100);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 10);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 46);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 6);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 48);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray1, 10);
        org.junit.Assert.assertNotNull(intArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray1), "[97]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 6);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2147483647);
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
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 47 + "'", int16 == 47);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) '4');
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 37);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 38 + "'", int19 == 38);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 50);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
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
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 106);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass24 = intArray2.getClass();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 114);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 114);
        int int28 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 7 + "'", int28 == 7);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 53);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 97);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 99);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
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
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 13);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 35);
        java.lang.Class<?> wildcardClass19 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 10);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        java.lang.Class<?> wildcardClass18 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 52);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 11);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 52);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 106);
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
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 32);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 3);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 32);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 33);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36 + "'", int11 == 36);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 33 + "'", int17 == 33);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 33 + "'", int19 == 33);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
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
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 3);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 36 + "'", int15 == 36);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 48);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 16);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 50);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 50 + "'", int17 == 50);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 106);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 34);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 12);
        java.lang.Class<?> wildcardClass15 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 11 + "'", int7 == 11);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 49 + "'", int18 == 49);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int27 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 4);
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 11 + "'", int25 == 11);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 40);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 47 + "'", int14 == 47);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 40 + "'", int16 == 40);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        java.lang.Class<?> wildcardClass20 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 11 + "'", int19 == 11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 47 + "'", int11 == 47);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass16 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 0);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 29);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 36);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 47);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 15);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 9);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 46 + "'", int12 == 46);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '#');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 51);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 46 + "'", int14 == 46);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 51 + "'", int20 == 51);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (byte) 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 33 + "'", int12 == 33);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 102 + "'", int18 == 102);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 18);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 18 + "'", int13 == 18);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 48);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
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
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 51);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 52);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 12);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 12);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 11 + "'", int11 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 12 + "'", int13 == 12);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 53);
        java.lang.Class<?> wildcardClass13 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass14 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 34);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 49);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 11);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        java.lang.Class<?> wildcardClass19 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
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
        // The following exception was thrown during execution in test generation
        try {
            int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 33);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 36);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 36 + "'", int12 == 36);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 36 + "'", int18 == 36);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 7);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 49);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 2);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 5);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 47);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass16 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 8);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 7);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 14);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 49 + "'", int14 == 49);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 49 + "'", int16 == 49);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
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
        int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 98);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) 'a');
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass17 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 97);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 0);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 46 + "'", int17 == 46);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 100);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 97);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 49 + "'", int8 == 49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 46 + "'", int11 == 46);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '4');
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 47 + "'", int12 == 47);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 8);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) -1);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
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
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 98);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 47 + "'", int18 == 47);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
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
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 100);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 5);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 42);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 42 + "'", int17 == 42);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 4);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 9);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 47);
        java.lang.Class<?> wildcardClass21 = intArray2.getClass();
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 37 + "'", int14 == 37);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 47 + "'", int20 == 47);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
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
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 46);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 1);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) '4');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 28);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 36);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 17);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36 + "'", int9 == 36);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 53);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 0);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 12);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 106);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 0);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '4');
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 8);
        int int22 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 100);
        java.lang.Class<?> wildcardClass20 = intArray0.getClass();
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) '4');
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 102);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 29);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        int[] intArray2 = new int[] { 36, 2 };
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) ' ');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 3);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 49);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (short) 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[36, 2]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '#');
        java.lang.Class<?> wildcardClass20 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36 + "'", int19 == 36);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
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
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 102);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (byte) 1);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 6);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int26 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 7 + "'", int26 == 7);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (byte) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 36);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) 'a');
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) ' ');
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (short) 1);
        int int18 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
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
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 0);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 16);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 33);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, 16);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int20 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 11);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray3);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) '4');
        java.lang.Class<?> wildcardClass16 = intArray3.getClass();
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 53 + "'", int15 == 53);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
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
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) '#');
        int int25 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 2);
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2 + "'", int25 == 2);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        int[] intArray3 = new int[] { (byte) 100, 1, (short) 1 };
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) ' ');
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 35);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 10);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, 1);
        int int13 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 10);
        int int15 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray3, (int) (byte) 1);
        int int17 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray3, (int) (short) 10);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[100, 1, 1]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 33 + "'", int5 == 33);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 36 + "'", int7 == 36);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 11 + "'", int9 == 11);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 14);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 49 + "'", int12 == 49);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 37);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 37 + "'", int16 == 37);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 0);
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) 'a');
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) (short) 100);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 100);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray0, (int) '#');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 10);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 100);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 100);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 53);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int19 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 7);
        int int21 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int23 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 55);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 46 + "'", int8 == 46);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        int int6 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 46);
        int int8 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) (byte) 10);
        int int10 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 7);
        int int12 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 34);
        int int14 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, (int) (short) 1);
        int int16 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 33);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 46 + "'", int6 == 46);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        int[] intArray2 = new int[] { '4', (short) 1 };
        int int4 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, (int) 'a');
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray2);
        int int7 = com.thealgorithms.dynamicprogramming.CoinChange.minimumCoins(intArray2, 32);
        int int9 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 35);
        int int11 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray2, 1);
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[52, 1]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 46 + "'", int4 == 46);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        int[] intArray0 = new int[] {};
        int int2 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, (int) (byte) 1);
        com.thealgorithms.dynamicprogramming.CoinChange.printAmount(intArray0);
        int int5 = com.thealgorithms.dynamicprogramming.CoinChange.change(intArray0, 47);
        org.junit.Assert.assertNotNull(intArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray0), "[]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }
}
